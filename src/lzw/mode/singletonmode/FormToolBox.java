package lzw.mode.singletonmode;

public class FormToolBox {

	private static FormToolBox formToolBox=null;
	private static Object object=new Object();//锁住，，，，，线程对象辅助
	private static Thread td=new Thread();//也可锁住，，，，，线程对象辅助
	private static Integer integer=new Integer(0);
	private static int count=0;
	private FormToolBox(){
		
	}
	//双重判定是否为null，加线程锁，保证产生一个实例
	public static FormToolBox getInstance(){
		if(formToolBox==null){
		synchronized (integer) {
			if(formToolBox==null){
				count++;
				System.out.println(Thread.currentThread().getName()+"创建第"+count+"实例");
				formToolBox=new FormToolBox();
			}
			
		}
		}
		return formToolBox;
	}
	//未加线程锁，多线程调用时不可保证单例
	public static FormToolBox getInstance2(){
		
			if(formToolBox==null){
				count++;
				System.out.println(Thread.currentThread().getName()+"创建第"+count+"实例");
				formToolBox=new FormToolBox();
			}
		return formToolBox;
	}
	
	//当formToolBox==null,一个线程被锁住，其他线程可以在if(formToolBox==null){  和  synchronized (integer)之间排队，解锁后同样产生新实例
	//与getInstance2()相比
	//getInstance2()：输出count都一样：如：3,3,3,3,3
	//getInstance3()：输出的count 为：1，2，3，4，5，6
	public static FormToolBox getInstance3(){
		if(formToolBox==null){
		synchronized (integer) {
			
				count++;
				System.out.println(Thread.currentThread().getName()+"创建第"+count+"实例");
				formToolBox=new FormToolBox();
			
			
		}
		}
		return formToolBox;
	}
}
