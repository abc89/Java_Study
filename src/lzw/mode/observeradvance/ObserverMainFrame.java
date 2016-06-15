package lzw.mode.observeradvance;
import java.util.Observer;


public class ObserverMainFrame {

	public static void main(String[] args){
	
		
		Subject subject=new SubjectOne();
		ObserverOne one=new ObserverOne(subject, "С��");
		ObserverTwo two=new ObserverTwo(subject, "С��");
		

		subject.getEventHandler().addEvent(one, "notifyOne","���ܿ�������");
		subject.getEventHandler().addEvent(two, "notifyTwo","��������Ϸs��");
		//subject.getEventHandler().addEvent(one, "notifyOne","���ܿ�������");
		subject.getEventHandler().removeEvent(0);
		subject.setState("boos come");
		subject.notifyObserver();
	}
}
