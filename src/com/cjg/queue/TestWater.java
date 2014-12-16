package com.cjg.queue;

import com.cjg.queue.Student;
import com.cjg.queue.Water;

public class TestWater {
	public static void main(String[] args){
		//控制了每个打水线程，在执行完之后，才会继续下一个线程
		Water water = new Water();
		Student a = new Student("a酱",water );
		Student b = new Student("b酱",water );
		Student c = new Student("c酱",water );
		Student d = new Student("d酱",water );
		
		a.start();
		b.start();
		c.start();
		d.start();

	}
}
