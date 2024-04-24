/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/24 17:22:00 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/24 17:22:00 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class PrimeNumCalculator
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("-> ");
		int number = scanner.nextInt();
		int steps = 0;

		if (number < 2)
		{
			System.out.println("IllegalArgument");
			System.exit(-1);
		}
		else if (number == 2)
		{
			System.out.println("true 1");
			System.exit(0);
		}

		boolean isPrime = true;
		int steps = 0;

		for (int i = 2; i <= number / 2; i++)
		{
			steps++;
			if (number % i == 0)
			{
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime + " " + steps);
	}
}
