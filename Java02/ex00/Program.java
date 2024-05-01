/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/05/01 19:41:42 by ofadhel           #+#    #+#             */
/*   Updated: 2024/05/01 20:22:44 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Program {
	public static void main(String[] args) {
		Map<String, String> signatures = readSignatures("signatures.txt");

		if (signatures.isEmpty()) {
			System.out.println("No signatures found. Exiting program.");
			return;
		}

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter file path (or 'exit' to quit): ");
			String filePath = scanner.nextLine().trim();

			if (filePath.equalsIgnoreCase("exit")) {
				break;
			}

			processFile(filePath, signatures);
		}

		scanner.close();
	}

	private static Map<String, String> readSignatures(String filename) {
		Map<String, String> signatures = new HashMap<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(", ");
				if (parts.length == 2) {
					signatures.put(parts[0], parts[1]);
				}
			}
		} catch (IOException e) {
			System.err.println("Error reading signatures file: " + e.getMessage());
		}

		return signatures;
	}

	private static void processFile(String filePath, Map<String, String> signatures) {
		try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
			byte[] buffer = new byte[8]; // Read the first 8 bytes
			int bytesRead = fileInputStream.read(buffer);

			if (bytesRead == -1) {
				System.out.println("Empty file: " + filePath);
				return;
			}

			String signature = bytesToHex(buffer);
			String fileType = findFileType(signature, signatures);

			writeResultToFile(fileType);
			System.out.println("PROCESSED");
		} catch (IOException e) {
			System.err.println("Error processing file: " + e.getMessage());
		}
	}

	private static String findFileType(String signature, Map<String, String> signatures) {
		for (Map.Entry<String, String> entry : signatures.entrySet()) {
			if (entry.getValue().equalsIgnoreCase(signature)) {
				return entry.getKey();
			}
		}
		return "UNDEFINED";
	}

	private static void writeResultToFile(String fileType) {
		try (FileWriter fileWriter = new FileWriter("result.txt", true)) {
			fileWriter.write(fileType + "\n");
		} catch (IOException e) {
			System.err.println("Error writing to result file: " + e.getMessage());
		}
	}

	private static String bytesToHex(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02X ", b));
		}
		return sb.toString().trim();
	}
}
