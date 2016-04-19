package thread;

public class ThreadTest1 extends Thread {
	public void run(){
		System.out.println("Mr.Lonely");
	}
	
	public static void main(String[] args){
		new ThreadTest1().start();
	}
}
