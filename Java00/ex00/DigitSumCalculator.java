/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   DigitSumCalculator.java                            :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/28 17:18:35 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/28 18:50:02 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class DigitSumCalculator {
    public static void main(String[] args) {
        int number = 479598;
        int sum = 0;

        // Calculate sum of digits
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // Print the result
        System.out.printf(sum + "\n");
        System.exit(0);
    }
}
