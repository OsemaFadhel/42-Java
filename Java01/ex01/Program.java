/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Program.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 16:10:31 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 17:23:38 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Alice", 1000.0);
        User user2 = new User("Bob", 2000.0);
		User user3 = new User("Charlie", 3000.0);

        System.out.println("User 1 ID: " + user1.getIdentifier());
        System.out.println("User 2 ID: " + user2.getIdentifier());
		System.out.println("User 3 ID: " + user3.getIdentifier());
    }
}
