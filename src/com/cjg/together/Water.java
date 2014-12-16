package com.cjg.together;

public class Water {
	int studentNum;
	public synchronized void flowWater(String studentName){
		synchronized(this){
			++studentNum;
			
			System.out.println("start flowing water for" + studentName);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("stop flowing water for" + studentName);
			
			if(studentNum < 4){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				notifyAll();
			}
			
		}
		
	}
}
