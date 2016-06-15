package lzw.mode.mediatorode;

public class ConcreteMediator extends Mediator{

	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;
	public void setColleague1(ConcreteColleague1 colleague1){
		this.colleague1=colleague1;
	}
	public void setColleague2(ConcreteColleague2 colleague2){
		this.colleague2=colleague2;
	}
	void send(String msg, Colleague colleague) {
		if(colleague==colleague1){
        colleague2.notifyC(msg);
	}
		else	if(colleague==colleague2){
	        colleague1.notifyC(msg);
		}
	}

}
