package lzw.mode.observeradvance;

public class ObserverOne implements Observer {

	private String obsesrverName;
	private Subject subject;
	public ObserverOne(Subject subject,String name){
		this.subject=subject;
		this.obsesrverName=name;
	}
	public void update() {
	}
     public void notifyOne(String msg){
    	 System.out.println("Í¨Öª£º"+subject.getState()+obsesrverName+"×¢Òâ£º"+msg);
    	 
     }
}
