package lzw.mode.singletonmode;

public class Main {

	private Thread td1;
	private Thread td2;
	private Thread td3;
	FormToolBox box1;
	FormToolBox box2;
	public Main(){
		
		td1=new Thread(new Runnable() {
			int i=10;
			boolean flag=true;
			public void run() {
				while(flag){
					
					box1=FormToolBox.getInstance();
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
					
					box2=FormToolBox.getInstance();
					i--;
					if(i<1){
						flag=false;
					}
				}
			}
		});
		td3=new Thread(new Runnable() {
			int i=10;
			boolean flag=true;
			public void run() {
				while(flag){
					
					box2=FormToolBox.getInstance();
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
		td3.setName("线程三");
		td3.start();
		
		
	}
	public static void main(String[] args) {

		new Main();
//		FormToolBox box=FormToolBox.getInstance();
//		FormToolBox box2=FormToolBox.getInstance();
//		if(box==box2){
//			System.out.println("两个实例相等");
//		}
	}

}
