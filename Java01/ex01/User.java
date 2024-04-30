/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   User.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 16:10:36 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 17:21:58 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class User{
	private int identifier;
	private String name;
	private double balance;

	public User(String name, double balance){
		if (balance < 0){
			System.out.printf("Balance cannot be negative\n");
			System.exit(1);
		}
		this.identifier = UserIdsGenerator.getInstance().generateId();
		this.name = name;
		this.balance = balance;
	}
	public int getIdentifier(){
		return identifier;
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
}
