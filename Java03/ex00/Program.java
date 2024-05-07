/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/05/06 16:07:52 by ofadhel           #+#    #+#             */
/*   Updated: 2024/05/07 11:23:04 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class Program {
	public static void main(String[] args) {
		// Check if the number of arguments is correct and get the count
		if (args.length != 1) {
			System.out.println("Error: args");
			return;
		}
		String[] argParts = args[0].split("=");
		if (argParts.length != 2 || !argParts[0].equals("--count")) {
			System.out.println("Invalid format. Use --count='number'");
			return;
		}
		int count;
		try {
			count = Integer.parseInt(argParts[1]);
		} catch (NumberFormatException e) {
			System.out.println("Invalid number");
			return;
		}
		// Create the threads
		Eggthread egg = new Eggthread(count);
		Henthread hen = new Henthread(count);

		// Start the threads
		egg.start();
		hen.start();
		try {
			egg.join();
			hen.join();
		} catch (InterruptedException e) {
			System.out.println("Error: join");
		}
		for (int i = 0; i < count; i++) {
			System.out.println("Human");
		}
	}
}
