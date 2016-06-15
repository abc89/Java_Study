package lzw.multithreading;

public class ManyThread {

	public static int count=0;
	public ManyThread(){}
	public void test(){
		synchronized (this) {
			
			count++;
			System.out.println(Thread.currentThread().getName()+"调用"+count+"次数");
		}
	}
}
