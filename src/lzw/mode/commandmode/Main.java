package lzw.mode.commandmode;

public class Main {

	public static void main(String[] args) {

		Receiver receiver=new Receiver();
		ConcreteCommand command1=new ConcreteCommand(receiver);
		ConcreteCommand command2=new ConcreteCommand(receiver);
		
		Invoker invoker=new Invoker();
		invoker.setOrder(command1);
		invoker.setOrder(command2);
		invoker.notifyR();
	}

}
