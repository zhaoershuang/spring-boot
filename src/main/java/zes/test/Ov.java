package zes.test;

public class Ov {
	public static void syH(){
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("----");
			}
		});
		thread.start();
	
	}
	void sayHello(){
		System.out.println("hello");
	}
	public static void main(String[] args) {
		syH();
	}

}
