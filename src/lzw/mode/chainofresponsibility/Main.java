package lzw.mode.chainofresponsibility;

public class Main {

	public static void main(String[] args){
		
	ConcreteHandler1 jingli=new ConcreteHandler1("经理");
	ConcreteHandler2 zongjingli=new ConcreteHandler2("总经理");
	ConcreteHandler3 zongcai=new ConcreteHandler3("总裁");
	
	//设置职位间的上下级关系
	jingli.setHandler(zongjingli);
	zongjingli.setHandler(zongcai);
		
	
	Request request=new Request();
		System.out.println("--------处理请求-------------------------------");
		request.requestType="加工资";
		request.requestNum=100;
	     jingli.HandlerRequest(request);
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("--------处理请求-------------------------------");
		request.requestType="加工资";
		request.requestNum=200;
	     jingli.HandlerRequest(request);
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("--------处理请求-------------------------------");
		request.requestType="加工资";
		request.requestNum=300;
	     jingli.HandlerRequest(request);
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("--------处理请求-------------------------------");
		request.requestType="加工资";
		request.requestNum=600;
	     jingli.HandlerRequest(request);
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("--------处理请求-------------------------------");
		request.requestType="加工资";
		request.requestNum=500;
	     jingli.HandlerRequest(request);
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}
