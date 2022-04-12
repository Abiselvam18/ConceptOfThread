package com.ThreadsConcept;

//Creating Thread by implementing Runnable interface
class MyThread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run method");
	}
}

public class MainRunnable {

	public static void main(String[] args) {
		MyThread1 ob=new MyThread1();
		//start method is defined in Thread
		Thread tob=new Thread(ob);
		tob.start();
		}

}