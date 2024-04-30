/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   UsersArrayList.java                                :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 17:26:28 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 21:10:51 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class UsersArrayList implements UsersList {
	private User[] users;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;

	public UsersArrayList() {
		users = new User[DEFAULT_CAPACITY];
		size = 0;
	}

	private void resize() {
		int newSize = users.length + users.length / 2;
		User[] newArray = new User[newSize];
		System.arraycopy(users, 0, newArray, 0, size);
		users = newArray;
	}

	@Override
	public void addUser(User user) {
		if (size == users.length) {
			resize();
		}
		users[size++] = user;
	}

	@Override
	public User getUserById(int id) throws UserNotFoundException {
		for (User user : users) {
			if (user != null && user.getId() == id) {
				return user;
			}
		}
		throw new UserNotFoundException("User with ID " + id + " not found");
	}

	@Override
	public User getUserByIndex(int index) throws UserNotFoundException {
		if (index >= size || index < 0) {
			throw new UserNotFoundException("Invalid index");
		}
		return users[index];
	}

	@Override
	public int getNumberOfUsers() {
		return size;
	}
}

