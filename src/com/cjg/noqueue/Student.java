package com.cjg.noqueue;

public class Student extends Thread{
	private String studentName;
	private Water water;
	public Student(String studentName , Water water){
		super();
		this.studentName = studentName;
		this.water = water;
	}
	
	public void receiveWater(){
		System.out.println(studentName + "从教室跑向饮水机");
		water.flowWater(studentName);
		System.out.println(studentName + "跑回教师");
	}
	
	public void run(){
		receiveWater();
	}
}
