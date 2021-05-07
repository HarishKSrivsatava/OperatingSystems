package com.harish.operating.system.Multithreading.NaturalNumberSummation;

import java.lang.Runnable;
import java.lang.Thread;
public class SummationDriver {
	public static void main(String[] args) {
		if(args.length < 0){
			System.err.print(args[0] + "must be >= 0" );
		}else{
			Sum sumObject = new Sum();
			int upper = Integer.parseInt(args[0]);
			Thread myThread = new Thread(new Summation(sumObject,upper));
			myThread.start();
			try {
				myThread.join();
				System.out.println("The sum of first "+upper+" natural number is "+sumObject.getSum());
			}catch(InterruptedException exe){
				System.err.print(exe.toString());
			}
		}
	}
}
