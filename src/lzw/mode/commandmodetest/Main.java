package lzw.mode.commandmodetest;

//客户端
public class Main {

	public static void main(String[] args) {

		Receiver receiver=new Receiver();
		
		//客户端只需下达命令，服务生记录命令，客户端与厨师分离开
		ConcreteCommand command1=new ConcreteCommand(receiver,"炒面");
		ConcreteCommand command2=new ConcreteCommand(receiver,"炒饭");
		ConcreteCommand command3=new ConcreteCommand(receiver,"烤鸡翅");
		ConcreteCommand command4=new ConcreteCommand(receiver,"烤羊肉串");
		ConcreteCommand command5=new ConcreteCommand(receiver,"炒菜");
		ConcreteCommand command6=new ConcreteCommand(receiver,"炒粉");
		
		//服务生记录命令
		Invoker invoker=new Invoker();
		invoker.setOrder(command1);
		invoker.setOrder(command2);
		invoker.setOrder(command3);
		invoker.setOrder(command4);
		invoker.setOrder(command5);
		invoker.setOrder(command6);
		
		//invoker.cancellOrder(command5);//客户取消某样东西
		invoker.notifyR();
	}

}
