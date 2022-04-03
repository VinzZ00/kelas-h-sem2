package pert5;

import javax.swing.JFrame;

public class DescThread extends JFrame implements Runnable {

	public DescThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 10; i > 0; i--) {
			System.out.println("Descending ke " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Descending sudah selesai");
	}

}
