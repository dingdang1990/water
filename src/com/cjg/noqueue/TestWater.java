package com.cjg.noqueue;

public class TestWater {
	//普通的多线程，没有控制任何的顺序
	public static void main(String[] args){
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
