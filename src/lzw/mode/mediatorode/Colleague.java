package lzw.mode.mediatorode;

public abstract class Colleague {

	protected Mediator mediator;
	public  Colleague(Mediator mediator){
		this.mediator=mediator;
		
	}
	abstract void send(String msg);
	
}
