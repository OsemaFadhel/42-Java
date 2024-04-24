/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/24 17:57:41 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/24 17:57:41 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class Main
{
	public static void main(String[] args) {
		User user1 = new User(1, "John", 1000.0);
		User user2 = new User(2, "Alice", 2000.0);

		Transaction transaction = new Transaction(user2, user1, "debit", 500.0);

		System.out.println("Transaction ID: " + transaction.getIdentifier());
		System.out.println("Sender: " + transaction.getSender().getName());
		System.out.println("Recipient: " + transaction.getRecipient().getName());
		System.out.println("Transfer Category: " + transaction.getTransferCategory());
		System.out.println("Transfer Amount: " + transaction.getTransferAmount());
	}
}
