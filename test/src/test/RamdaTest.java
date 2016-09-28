package test;

public class RamdaTest implements Func{ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Func sub = (int a, int b) -> a - b;
		
		new Thread(()->{
			System.out.println("Hello World.");
		}).start();
	}

	@Override
	public int calc(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
