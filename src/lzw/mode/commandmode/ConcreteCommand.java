package lzw.mode.commandmode;

public class ConcreteCommand extends Command  {

	
	public ConcreteCommand(Receiver receiver){
		super(receiver);
	}
	public void execute(){
		receiver.action();
	}
}
