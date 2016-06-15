package lzw.mode.observer;
import java.util.ArrayList;
import java.util.List;


public class SubjectOne extends Subject {

	private List<Observer> observers=new ArrayList<Observer>();
	private String subjectState;
	public void notifyObserver() {
		for(Observer observer:observers){
			observer.update();
		}
	}

	public void attch(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public String getSubjectState() {
		
		return this.subjectState;
	}

	
	public void setSubjectState(String state) {
		
		this.subjectState=state;
	}

	

}
