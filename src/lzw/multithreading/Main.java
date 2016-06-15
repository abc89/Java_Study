package lzw.multithreading;

public class Main {

	private Thread td1;
	private Thread td2;
	public Main(){
		final ManyThread manyThread=new ManyThread();
		td1=new Thread(new Runnable() {
			int i=10;
			boolean flag=true;
			public void run() {
				while(flag){
					manyThread.test();
					//box1=FormToolBox.getInstance();
					i--;
					if(i<1){
						flag=false;
					}
				}
			}
		});
		td2=new Thread(new Runnable() {
			int i=10;
			boolean flag=true;
			public void run() {
				while(flag){
					manyThread.test();
				//	box2=FormToolBox.getInstance();
					i--;
					if(i<1){
						flag=false;
					}
				}
			}
		});
		td1.setName("线程一");
		td2.setName("线程二");
		td1.start();
		td2.start();
		
		
	}
	public static void main(String[] args) {

		new Main();

	}

}
