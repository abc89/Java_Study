package lzw.mode.observer;
import java.util.Observer;


public class ObserverMainFrame {

	public static void main(String[] args){
	
		
		Subject subject=new SubjectOne();
		ObserverOne one=new ObserverOne(subject, "Ð¡Íõ");
		ObserverTwo two=new ObserverTwo(subject, "Ð¡³Â");
		
		subject.attch(one);
		subject.attch(two);
		
		subject.detach(two);
		
		subject.setSubjectState("ss");
		subject.notifyObserver();
	}
}
