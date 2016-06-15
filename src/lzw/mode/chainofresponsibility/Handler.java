package lzw.mode.chainofresponsibility;

public abstract class Handler {

	protected Handler successor;//上一级管理者
	protected String curHandlerName;//当前管理者职位
	public  void setHandler(Handler handler){
		this.successor=handler;
	}
	abstract void HandlerRequest(Request request);//请求处理
}
