package test;

public class ThreadTest  implements Runnable {
	
	@Override
	public void run() {
		System.out.println("11");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t= new Thread(new ThreadTest());
		t.start();
		
	}

}
