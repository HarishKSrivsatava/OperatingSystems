package com.harish.operating.system.Multithreading.NaturalNumberSummation;

import java.lang.Runnable;
public class Summation implements Runnable {
	
	private Sum sumValue;
	private int upper;
	
	public Summation(Sum sumValue, int upper){
		this.sumValue = sumValue;
		this.upper = upper;
	}
	
	public void run(){
		int sum = 0;
		for(int i = 0; i <= upper; i++){
			sum += i;
		}
		sumValue.setSum(sum);
	}
}
