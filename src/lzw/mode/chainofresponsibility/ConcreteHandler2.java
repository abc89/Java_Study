package lzw.mode.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

	public ConcreteHandler2(String name){
		curHandlerName=name;
		
	}
	public void setHandler(Handler handler) {
		
		super.setHandler(handler);
	}

	void HandlerRequest(Request request) {
		if(request.requestType=="�ӹ���"&&request.requestNum<200){
			System.out.println(curHandlerName+"��������--"+request.requestType);		
		}else{
			
				System.out.println(request.requestType+"--������Ŀ����"+curHandlerName+"Ȩ�޷�Χ��ת����һ������");
				successor.HandlerRequest(request);
			
			}
	}

}
