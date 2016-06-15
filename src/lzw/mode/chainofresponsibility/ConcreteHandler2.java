package lzw.mode.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

	public ConcreteHandler2(String name){
		curHandlerName=name;
		
	}
	public void setHandler(Handler handler) {
		
		super.setHandler(handler);
	}

	void HandlerRequest(Request request) {
		if(request.requestType=="加工资"&&request.requestNum<200){
			System.out.println(curHandlerName+"处理请求--"+request.requestType);		
		}else{
			
				System.out.println(request.requestType+"--请求数目超出"+curHandlerName+"权限范围，转至上一级处理");
				successor.HandlerRequest(request);
			
			}
	}

}
