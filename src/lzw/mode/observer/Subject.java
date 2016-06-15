package lzw.mode.observer;

public abstract class Subject {
	
   public  abstract void attch(Observer observer);
   public  abstract void detach(Observer observer);
   public  abstract void notifyObserver();
   public  abstract String getSubjectState();
   public  abstract void setSubjectState(String state);
}
