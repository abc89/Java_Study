package lzw.mode.observer;

public class ObserverTwo implements Observer {

	private String obsesrverName;
	private Subject subject;
	public ObserverTwo(Subject subject,String name){
		this.subject=subject;
		this.obsesrverName=name;
	}
	
	public void update() {
		System.out.println("֪ͨ��"+obsesrverName+"ע�⣺"+subject.getSubjectState());
	}

	
}
