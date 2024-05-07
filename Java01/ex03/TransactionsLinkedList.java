/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   TransactionsLinkedList.java                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 21:42:31 by ofadhel           #+#    #+#             */
/*   Updated: 2024/05/07 09:51:51 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.UUID;

public class TransactionsLinkedList implements TransactionsList {
	private Transaction head;
	@Override
	public void addTransaction(Transaction transaction) {
		if (head == null) {
			head = transaction;
		} else {
			Transaction current = head;
			while (current.getNextTransaction() != null) {
				current = current.getNextTransaction();
			}
			current.setNextTransaction(transaction);
		}
	}

	@Override
	public void removeTransaction(UUID id) throws TransactionNotFoundException {
		if (head == null) {
			throw new TransactionNotFoundException("Transaction with ID " + id + " not found");
		}

		if (head.getIdentifier().equals(id)) {
			head = head.getNextTransaction();
			return;
		}

		Transaction current = head;
		while (current.getNextTransaction() != null) {
			if (current.getNextTransaction().getIdentifier().equals(id)) {
				current.setNextTransaction(current.getNextTransaction().getNextTransaction());
				return;
			}
			current = current.getNextTransaction();
		}

		throw new TransactionNotFoundException("Transaction with ID " + id + " not found");
	}

	@Override
	public Transaction[] toArray() {
		if (head == null) {
			return new Transaction[0];
		}

		int size = 0;
		Transaction current = head;
		while (current != null) {
			size++;
			current = current.getNextTransaction();
		}

		Transaction[] transactionsArray = new Transaction[size];
		current = head;
		int index = 0;
		while (current != null) {
			transactionsArray[index++] = current;
			current = current.getNextTransaction();
		}
		return transactionsArray;
	}
}
