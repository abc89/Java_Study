package lzw.mode.mediatorode;

public class ConcreteColleague1 extends Colleague {


	public ConcreteColleague1(Mediator mediator) {
		
		super(mediator);
	}

	void send(String msg) {
		mediator.send(msg, this);
	}

	public void notifyC(String msg) {
		System.out.println("colleague2"+msg);
	}

}
