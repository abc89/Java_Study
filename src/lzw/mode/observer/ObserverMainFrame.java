package lzw.mode.observer;
import java.util.Observer;


public class ObserverMainFrame {

	public static void main(String[] args){
	
		
		Subject subject=new SubjectOne();
		ObserverOne one=new ObserverOne(subject, "С��");
		ObserverTwo two=new ObserverTwo(subject, "С��");
		
		subject.attch(one);
		subject.attch(two);
		
		subject.detach(two);
		
		subject.setSubjectState("ss");
		subject.notifyObserver();
	}
}
