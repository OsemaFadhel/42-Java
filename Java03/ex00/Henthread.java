/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Henthread.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ofadhel <ofadhel@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/05/06 16:18:20 by ofadhel           #+#    #+#             */
/*   Updated: 2024/05/07 10:21:41 by ofadhel          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */


public class Henthread extends Thread {
	private int count;

	public Henthread(int count){
		this.count = count;
	}
	public void run(){
		for (int i = 0; i < count; i++)
			System.out.println("Hen");
	}
}
