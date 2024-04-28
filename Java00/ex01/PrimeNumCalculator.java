/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   PrimeNumCalculator.java                            :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/24 17:22:00 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/28 18:49:51 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;

public class PrimeNumCalculator
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.printf("-> ");
		int number = scanner.nextInt();
		int steps = 0;

		if (number < 2)
		{
			System.out.printf("IllegalArgument\n");
			System.exit(-1);
		}
		else if (number == 2)
		{
			System.out.printf("true 1\n");
			System.exit(0);
		}

		boolean isPrime = true;

		for (int i = 2; i <= number / 2; i++)
		{
			steps++;
			if (number % i == 0)
			{
				isPrime = false;
				break;
			}
		}

		System.out.printf(isPrime + " " + steps + "\n");
		System.exit(0);
	}
}
