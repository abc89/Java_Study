package lzw.mode.chainofresponsibility;

public class ConcreteHandler1 extends Handler {



	public ConcreteHandler1(String name){
		curHandlerName=name;
		
	}
	public void setHandler(Handler handler) {
		
		super.setHandler(handler);
	}

	void HandlerRequest(Request request) {
		if(request.requestType=="�ӹ���"&&request.requestNum<100){
	       System.out.println(curHandlerName+"��������--"+request.requestType);		
		}else{
			
				System.out.println(request.requestType+"--������Ŀ����"+curHandlerName+"Ȩ�޷�Χ��ת����һ������");
			successor.HandlerRequest(request);
		
		}
	}
	

}
