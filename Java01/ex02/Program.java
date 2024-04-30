/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 17:27:29 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 21:03:29 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class Program {
	public static void main(String[] args) {
		UsersList usersList = new UsersArrayList();

		usersList.addUser(new User(1, "Alice"));
		usersList.addUser(new User(2, "Bob"));

		try {
			User user1 = usersList.getUserById(1);
			System.out.println("User found by ID: " + user1.getName());

			User user2 = usersList.getUserByIndex(1);
			System.out.println("User found by index: " + user2.getName());

			System.out.println("Number of users: " + usersList.getNumberOfUsers());
		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
