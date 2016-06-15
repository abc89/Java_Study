package lzw.mode.mediatorode;

public class ConcreteColleague2 extends Colleague {

public  ConcreteColleague2(Mediator mediator) {
		
		super(mediator);
	}

	void send(String msg) {
		mediator.send(msg, this);
	}

	public void notifyC(String msg) {
		System.out.println("COLLWAGUE2收到某国的通知"+msg);
	}

}
