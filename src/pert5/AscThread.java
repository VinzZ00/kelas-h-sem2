package pert5;

public class AscThread extends Thread{
	int globvar = 0;
	
	public AscThread() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("ascending ke " + i);
			//untuk melakukan stop secara paksa
//			if (i == 9) {
//				this.stop();
//			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		System.out.println("Ascending selesai");	
	}

}
