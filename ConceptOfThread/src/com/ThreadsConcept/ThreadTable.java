package com.ThreadsConcept;
class Table{
	synchronized void printTable(int n) { //if n=2
		for(int i=1;i<=10;i++) {
			System.out.println(n+"X"+i+"="+n*i);  //2X1=2
		}
	}
}

class FirstThread extends Thread{
	Table t;
	FirstThread(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(2);
		System.out.println("=============");
	}
}

class SecondThread extends Thread{
	Table t;
	SecondThread(Table t){
		this.t=t;
		
	}
	public void run() {
		t.printTable(4);
		System.out.println("=============");
	}
}

class ThirdThread extends Thread{
	Table t;
	ThirdThread(Table t){
		this.t=t;
		
	}
	public void run() {
		t.printTable(6);
		System.out.println("=============");
	}
}
public class ThreadTable {
	public static void main(String[] args) throws InterruptedException {
		Table tob=new Table();
		FirstThread t1=new FirstThread(tob);
		SecondThread t2=new SecondThread(tob);
		ThirdThread t3=new ThirdThread(tob);
		t1.start();
		//t1.join();
		t2.start();
		t3.start();
	}
}
