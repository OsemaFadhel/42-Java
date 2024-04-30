/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   UserIdsGenerator.java                              :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 16:10:33 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 17:17:17 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class UserIdsGenerator
{
	private static UserIdsGenerator instance;
	private int lastGeneratedId;

	private UserIdsGenerator() {
		// Initialize the last generated ID
		lastGeneratedId = 0;
	}
	public static UserIdsGenerator getInstance() {
		if (instance == null) {
			instance = new UserIdsGenerator();
		}
		return instance;
	}
	public synchronized int generateId() {
		return ++lastGeneratedId;
	}
}
