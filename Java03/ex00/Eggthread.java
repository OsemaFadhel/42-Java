/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Eggthread.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/05/06 16:17:04 by ofadhel           #+#    #+#             */
/*   Updated: 2024/05/07 10:21:57 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */


public class Eggthread extends Thread {
	private int count;

	public Eggthread(int count){
		this.count = count;
	}
	public void run(){
		for (int i = 0; i < count; i++)
			System.out.println("Egg");
	}
}
