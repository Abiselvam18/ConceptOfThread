package com.ThreadsConcept;

class MyThread extends Thread{
	public void run() {
		System.out.println("Inside run "+Thread.currentThread());
	}
}

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread()); 
		MyThread ob=new MyThread();
		MyThread ob1=new MyThread();
		ob.setName("first"); 
		ob1.setName("second");
		ob.start();
		ob1.start();
		
	}
}