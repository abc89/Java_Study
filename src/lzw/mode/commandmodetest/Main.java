package lzw.mode.commandmodetest;

//�ͻ���
public class Main {

	public static void main(String[] args) {

		Receiver receiver=new Receiver();
		
		//�ͻ���ֻ���´������������¼����ͻ������ʦ���뿪
		ConcreteCommand command1=new ConcreteCommand(receiver,"����");
		ConcreteCommand command2=new ConcreteCommand(receiver,"����");
		ConcreteCommand command3=new ConcreteCommand(receiver,"������");
		ConcreteCommand command4=new ConcreteCommand(receiver,"�����⴮");
		ConcreteCommand command5=new ConcreteCommand(receiver,"����");
		ConcreteCommand command6=new ConcreteCommand(receiver,"����");
		
		//��������¼����
		Invoker invoker=new Invoker();
		invoker.setOrder(command1);
		invoker.setOrder(command2);
		invoker.setOrder(command3);
		invoker.setOrder(command4);
		invoker.setOrder(command5);
		invoker.setOrder(command6);
		
		//invoker.cancellOrder(command5);//�ͻ�ȡ��ĳ������
		invoker.notifyR();
	}

}
