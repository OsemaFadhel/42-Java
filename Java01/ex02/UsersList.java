/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   UsersList.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 17:26:39 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 20:59:23 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public interface UsersList {
	void addUser(User user);
	User getUserById(int id) throws UserNotFoundException;
	User getUserByIndex(int index) throws UserNotFoundException;
	int getNumberOfUsers();
}
