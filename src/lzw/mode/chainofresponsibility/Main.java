package lzw.mode.chainofresponsibility;

public class Main {

	public static void main(String[] args){
		
	ConcreteHandler1 jingli=new ConcreteHandler1("����");
	ConcreteHandler2 zongjingli=new ConcreteHandler2("�ܾ���");
	ConcreteHandler3 zongcai=new ConcreteHandler3("�ܲ�");
	
	//����ְλ������¼���ϵ
	jingli.setHandler(zongjingli);
	zongjingli.setHandler(zongcai);
		
	
	Request request=new Request();
		System.out.println("--------��������-------------------------------");
		request.requestType="�ӹ���";
		request.requestNum=100;
	     jingli.HandlerRequest(request);
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("--------��������-------------------------------");
		request.requestType="�ӹ���";
		request.requestNum=200;
	     jingli.HandlerRequest(request);
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("--------��������-------------------------------");
		request.requestType="�ӹ���";
		request.requestNum=300;
	     jingli.HandlerRequest(request);
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("--------��������-------------------------------");
		request.requestType="�ӹ���";
		request.requestNum=600;
	     jingli.HandlerRequest(request);
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("--------��������-------------------------------");
		request.requestType="�ӹ���";
		request.requestNum=500;
	     jingli.HandlerRequest(request);
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}
