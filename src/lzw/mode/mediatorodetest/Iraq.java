package lzw.mode.mediatorodetest;

public class Iraq extends Countrys {


	public Iraq(UniteNations uniteNations) {
		
		super(uniteNations);
	}

	void send(String msg) {
		uniteNations.send(msg, this);
	}

	public void notifyC(String msg) {
		System.out.println("�������յ���Ϣ"+msg);
	}

}
