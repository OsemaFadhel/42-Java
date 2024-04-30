/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   UserNotFoundException.java                         :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 17:26:44 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 21:21:25 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */


public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String message) {
		super(message);
	}
}

