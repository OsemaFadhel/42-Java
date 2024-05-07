/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Eggthread.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/05/06 16:17:04 by ofadhel           #+#    #+#             */
/*   Updated: 2024/05/07 12:46:50 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */


public class Eggthread extends Thread {
	private int count;
	private Egghenmonitor monitor;

	public Eggthread(int count, Egghenmonitor monitor){
		this.count = count;
		this.monitor = monitor;
	}
	public void run(){
		for (int i = 0; i < count; i++)
			monitor.printEgg();
	}
}
