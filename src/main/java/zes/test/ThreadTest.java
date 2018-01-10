package zes.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
	public static void main(String[] args) {
		/*ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 100000; i++) {
			final int index = i;
			newCachedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(index);
				}
			});
		}*/
		
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(100);
		Date date1 = new Date();
		for (int i = 0; i < 100000; i++) {
			final int index = i;
			fixedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(index);
				}
			});
		}
		Date date2 = new Date();
		int sum = (int) (date2.getTime()-date1.getTime());
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------"+sum);
	}
}
