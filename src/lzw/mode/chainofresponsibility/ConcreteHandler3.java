package lzw.mode.chainofresponsibility;
//最高级别管理者
public class ConcreteHandler3 extends Handler{
	public ConcreteHandler3(String name){
		curHandlerName=name;
		
	}
	

	void HandlerRequest(Request request) {
		if(request.requestType=="加工资"&&request.requestNum<500){
			System.out.println(curHandlerName+"处理请求--"+request.requestType);		
			}else{
			if(successor!=null){
				System.out.println(request.requestType+"--请求数目超出"+curHandlerName+"权限范围，转至上一级处理");
			successor.HandlerRequest(request);
			}else{
				System.out.println(curHandlerName+"--不批准该请求");

			}
		}
	}
}
