package com.cjg.noqueue;

public class Water {
	public void flowWater(String studentName){
		System.out.println("开始为" + studentName + "流水" );
		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("结束为"+ studentName +"放水");
	}
}
