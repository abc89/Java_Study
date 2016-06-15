package lzw.mode.statemode;

public class Main {

	public static void main(String[] args){
		Work w=new Work("Ð¡³Â");
		w.setHour(11);
		w.showCurrentState();
		w.setHour(12);
		w.showCurrentState();
		w.setHour(15);
		w.showCurrentState();
		w.setHour(18);
		w.showCurrentState();
		w.setHour(19);
		w.showCurrentState();
		w.setHour(22);
		w.showCurrentState();
	}
}
