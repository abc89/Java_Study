package lzw.mode.mediatorodetest;

public class USA extends Countrys {

public  USA(UniteNations uniteNations) {
		
		super(uniteNations);
	}

	void send(String msg) {
		 uniteNations.send(msg, this);
	}

	public void notifyC(String msg) {
		System.out.println("COLLWAGUE2�յ�ĳ����֪ͨ"+msg);
	}

}
