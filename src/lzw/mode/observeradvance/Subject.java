package lzw.mode.observeradvance;

interface Subject {
	

   public  abstract void notifyObserver();
   public abstract EventHandler getEventHandler();
   public abstract String getState();
   public abstract void setState(String state);
}
