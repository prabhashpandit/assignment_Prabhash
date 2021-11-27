package com.prabhash.Worker;

public class Worker {
	
	String name;
	int salary_rate=50;
	public static void main(String args[]){
	Daily_worker d=new Daily_worker();

	d.ComPay(50);
	Salaried_worker s=new Salaried_worker();
	s.ComPay(50);
	}
}
	class Daily_worker extends Worker{
	void ComPay(int hours){
	System.out.println(salary_rate*hours);
	}
	}
	class Salaried_worker extends Worker{
	void ComPay(int hours){
	System.out.println(salary_rate*40);
	}

}
