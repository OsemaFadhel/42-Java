/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   User.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/24 17:55:09 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 17:24:15 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class User
{
	private int identifier;
	private String name;
	private double balance;

	public User(int identifier, String name, double balance)
	{
		if (balance < 0){
			System.out.printf("Balance cannot be negative\n");
			System.exit(1);
		}
		this.identifier = identifier;
		this.name = name;
		this.balance = balance;
	}
	public int getIdentifier(){
		return identifier;
	}
	public void setIdentifier(int identifier){
		this.identifier = identifier;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
}
