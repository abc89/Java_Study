package lzw.mode.observeradvance;
import java.util.ArrayList;
import java.util.List;


public class SubjectOne implements Subject {

	private List<Observer> observers=new ArrayList<Observer>();
	private String subjectState;
	private EventHandler handler;
	public SubjectOne(){
		handler=new EventHandler();
	}
	public void notifyObserver() {
		
		try {
			handler.notifyEveryOne();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	
	public String getSubjectState() {
		
		return this.subjectState;
	}

	
	public void setSubjectState(String state) {
		
		this.subjectState=state;
	}

	@Override
	public EventHandler getEventHandler() {
		
		return handler;
	}
	@Override
	public String getState() {
		
		return subjectState;
	}
	
	public void setState(String state) {
		this.subjectState=state;
	}
	

	

}
