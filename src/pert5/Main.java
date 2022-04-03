package pert5;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
		//kegunaan dari multithread
		//masing" thread memiliki dunia tersendiri
//		int desc = 10, asc = 1;
//		while (desc != 0 && asc != 11) {
//			System.out.println("ascending ke " + asc);
//			System.out.println("Descending ke " + desc);
//			
//			try {
//				if (asc == 5) {
//					System.out.println(1/0);
//				}
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
//			asc++;
//			desc--;
//			
//			try {
//				
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
//		for(int a= 10, b = 0 ; a > 0; a--, b++) {
//			System.out.println("ascending ke " + b);
//			System.out.println("Descending ke " + a);
//		}
		
		//sama dengan sebuah class yang mengextends class thread
		Thread th = new Thread() {
			@Override
			public void run() {
				
				for (int i = 1; i <= 3; i++) {
					System.out.println("Detik ke " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			};
		};
		
		
		AscThread asc = new AscThread();
		DescThread des = new DescThread();
		Thread descThread = new Thread(des);
		descThread.setDaemon(true);
		
		
		asc.start();
		th.start();
		try {
			th.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		descThread.start();
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Ini bukan asc, bukan desc");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
