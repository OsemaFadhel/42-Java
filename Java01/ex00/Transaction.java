/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Transaction.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/04/24 17:57:31 by ofadhel           #+#    #+#             */
/*   Updated: 2024/04/24 17:57:31 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.UUID;

public class Transaction
{
	private UUID identifier;
	private User recipient;
	private User sender;
	private String transferCategory;
	private double transferAmount;

	public Transaction(User recipient, User sender, String transferCategory, double transferAmount)
	{
		this.identifier = UUID.randomUUID();
		this.recipient = recipient;
		this.sender = sender;
		this.transferCategory = transferCategory;
		this.transferAmount = transferAmount;
	}
	public UUID getIdentifier()
		return identifier;
	public void setIdentifier(UUID identifier)
		this.identifier = identifier;
	public User getRecipient()
		return recipient;
	public void setRecipient(User recipient)
		this.recipient = recipient;
	public User getSender()
		return sender;
	public void setSender(User sender)
		this.sender = sender;
	public String getTransferCategory()
		return transferCategory;
	public void setTransferCategory(String transferCategory)
		this.transferCategory = transferCategory;
	public double getTransferAmount()
		return transferAmount;
	public void setTransferAmount(double transferAmount)
		this.transferAmount = transferAmount;
}
