package lzw.mode.chainofresponsibility;
//��߼��������
public class ConcreteHandler3 extends Handler{
	public ConcreteHandler3(String name){
		curHandlerName=name;
		
	}
	

	void HandlerRequest(Request request) {
		if(request.requestType=="�ӹ���"&&request.requestNum<500){
			System.out.println(curHandlerName+"��������--"+request.requestType);		
			}else{
			if(successor!=null){
				System.out.println(request.requestType+"--������Ŀ����"+curHandlerName+"Ȩ�޷�Χ��ת����һ������");
			successor.HandlerRequest(request);
			}else{
				System.out.println(curHandlerName+"--����׼������");

			}
		}
	}
}
