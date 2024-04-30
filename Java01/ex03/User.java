/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   User.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 17:26:44 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 22:22:00 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */


public class User
{
	private final int id;
	private String name;
	private double balance;
	private TransactionsList transactions;

	public User(int id, String name, double balance){
		if (balance < 0){
			System.out.printf("Balance cannot be negative\n");
			System.exit(1);
		}
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.transactions = new TransactionsLinkedList();
	}
	public int getId() {
		return id;
	}
	public String getName(){
		return name;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public TransactionsList getTransactions() {
		return transactions;
	}
}
