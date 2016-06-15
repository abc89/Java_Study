package lzw.mode.commandmodetest;

public class ConcreteCommand extends Command  {

	//调用父类结构体
	public ConcreteCommand(Receiver receiver,String msg){
		super(receiver,msg);
	}
	public void execute(){
		//父类commandMsg
		receiver.action(commandMsg);
	}
}
