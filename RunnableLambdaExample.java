package LambadaEXample;

public class RunnableLambadaExample {
public static void main (String args[]) {
	Runnable r1 = new Runnable () {
		@Override
		public void run() {
			System.out.println("Inside Runnable1");
		}
	};
		Runnable r2 = () -> {
			System.out.println(" Runnable lambda expression");
			
		};

		new Thread (r1).start();
	     new Thread (r2).start();
}
}
