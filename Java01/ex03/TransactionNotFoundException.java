/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   TransactionNotFoundException.java                  :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 22:11:15 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 22:11:27 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

public class TransactionNotFoundException extends RuntimeException {
	public TransactionNotFoundException(String message) {
		super(message);
	}
}

