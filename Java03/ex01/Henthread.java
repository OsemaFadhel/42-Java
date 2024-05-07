/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Henthread.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/05/06 16:18:20 by ofadhel           #+#    #+#             */
/*   Updated: 2024/05/07 12:47:15 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */


public class Henthread extends Thread {
	private int count;
	private Egghenmonitor monitor;

	public Henthread(int count, Egghenmonitor monitor){
		this.count = count;
		this.monitor = monitor;
	}
	public void run(){
		for (int i = 0; i < count; i++)
			monitor.printHen();
	}
}
