package com.cjg.together;

public class Student extends Thread{
	private String studentName;
	private Water water;
	
	public Student(String studentName,Water water){
		super();
		this.studentName = studentName;
		this.water = water;
	}
	
	public void receiveWater(){
		System.out.println(studentName +"跑出教室去接水。。。");
		water.flowWater(studentName);
		System.out.println(studentName + "接完水，跑回教室");
	}
	
	public void run(){
		receiveWater();
	}
}
