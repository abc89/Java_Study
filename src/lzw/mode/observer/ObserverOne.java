package lzw.mode.observer;

public class ObserverOne implements Observer {

	private String obsesrverName;
	private Subject subject;
	public ObserverOne(Subject subject,String name){
		this.subject=subject;
		this.obsesrverName=name;
	}
	public void update() {
		System.out.println("֪ͨ��"+obsesrverName+"ע�⣺"+subject.getSubjectState());
	}

}
