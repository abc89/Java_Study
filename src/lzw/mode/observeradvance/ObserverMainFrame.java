package lzw.mode.observeradvance;
import java.util.Observer;


public class ObserverMainFrame {

	public static void main(String[] args){
	
		
		Subject subject=new SubjectOne();
		ObserverOne one=new ObserverOne(subject, "小王");
		ObserverTwo two=new ObserverTwo(subject, "小陈");
		

		subject.getEventHandler().addEvent(one, "notifyOne","不能看电视了");
		subject.getEventHandler().addEvent(two, "notifyTwo","不能玩游戏s了");
		//subject.getEventHandler().addEvent(one, "notifyOne","不能看电视了");
		subject.getEventHandler().removeEvent(0);
		subject.setState("boos come");
		subject.notifyObserver();
	}
}
