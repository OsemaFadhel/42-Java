/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   User.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 17:26:44 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 21:21:09 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */


public class User
{
	private final int id;
	private String name;

	public User(int id, String name){
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
