package lzw.mode.commandmodetest;

public class ConcreteCommand extends Command  {

	//���ø���ṹ��
	public ConcreteCommand(Receiver receiver,String msg){
		super(receiver,msg);
	}
	public void execute(){
		//����commandMsg
		receiver.action(commandMsg);
	}
}
