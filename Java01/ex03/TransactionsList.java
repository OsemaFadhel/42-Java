/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   TransactionsList.java                              :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/30 21:42:36 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/30 21:59:37 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.UUID;

public interface TransactionsList {
	void addTransaction(Transaction transaction);
	void removeTransaction(UUID id) throws TransactionNotFoundException;
	Transaction[] toArray();
}
