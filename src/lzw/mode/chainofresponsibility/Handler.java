package lzw.mode.chainofresponsibility;

public abstract class Handler {

	protected Handler successor;//��һ��������
	protected String curHandlerName;//��ǰ������ְλ
	public  void setHandler(Handler handler){
		this.successor=handler;
	}
	abstract void HandlerRequest(Request request);//������
}
