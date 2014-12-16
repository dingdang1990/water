package com.cjg.queue;

public class Water {
	public synchronized void flowWater(String studentName){
		System.out.println("start flowing water for student" + studentName );
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("stop flowing water for " + studentName);
	}
}
