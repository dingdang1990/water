package com.cjg.together;

import com.cjg.together.Student;

public class TestWater {
	public static void main(String[] args){
		//控制了每个线程的完成打水方法，在执行之后进行sleep，等待一起完成方法之后结束线程
		Water water = new Water();
		Student a = new Student("a酱",water); 
		Student b = new Student("b酱",water );
		Student c = new Student("c酱",water );
		Student d = new Student("d酱",water );
		
		a.start();
		b.start();
		c.start();
		d.start();
	}
	
	
}
