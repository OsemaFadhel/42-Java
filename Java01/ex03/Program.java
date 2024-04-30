/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 21:42:25 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 22:21:26 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.UUID;

public class Program {
	public static void main(String[] args) {
		User user = new User(1, "Alice", 1000.0);
		User user2 = new User(2, "Bob", 5000.0);

		Transaction transaction = new Transaction(user, user2, "Food", 10.0);
		Transaction transaction2 = new Transaction(user2, user, "Rent", 100.0);

		user.getTransactions().addTransaction(transaction);
		user.getTransactions().addTransaction(transaction2);

		Transaction[] transactions = user.getTransactions().toArray();
		for (Transaction t : transactions) {
			System.out.println(t.getIdentifier());
		}

		try {
			user.getTransactions().removeTransaction(UUID.randomUUID());
		} catch (TransactionNotFoundException e) {
			System.out.println(e.getMessage());
		}

		transactions = user.getTransactions().toArray();
		for (Transaction t : transactions) {
			System.out.println(t.getIdentifier());
		}

		transactions = user2.getTransactions().toArray();
		for (Transaction t : transactions) {
			System.out.println(t.getIdentifier());
		}

		System.out.println(user.getBalance());
		System.out.println(user2.getBalance());

	}
}
