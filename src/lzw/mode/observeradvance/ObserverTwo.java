package lzw.mode.observeradvance;

public class ObserverTwo implements Observer {

	private String obsesrverName;
	private Subject subject;
	public ObserverTwo(Subject subject,String name){
		this.subject=subject;
		this.obsesrverName=name;
	}

	public void update() {
		
	}
	
	public void notifyTwo(String msg){
		 System.out.println("֪ͨ��"+subject.getState()+obsesrverName+"ע�⣺"+msg);
	}

	
}
