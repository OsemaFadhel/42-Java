/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   User.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/24 17:55:09 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 05:48:04 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class User
{
	private int identifier;
	private String name;
	private double balance;

	public User(int identifier, String name, double balance)
	{
		if (balance < 0)
			throw new IllegalArgumentException("Balance cannot be negative");
		this.identifier = identifier;
		this.name = name;
		this.balance = balance;
	}
	public int getIdentifier()
		return identifier;
	public void setIdentifier(int identifier)
		this.identifier = identifier;
	public String getName()
		return name;
	public void setName(String name)
		this.name = name;
	public double getBalance()
		return balance;
	public void setBalance(double balance)
		this.balance = balance;
}
