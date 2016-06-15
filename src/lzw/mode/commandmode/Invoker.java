package lzw.mode.commandmode;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command> orders=new ArrayList<Command>();
	public void setOrder(Command command){
		orders.add(command);
		
	}
	//客户下单完毕，服务员 通知处理者（厨师）执行命令
	public void notifyR(){
		for(Command c:orders){
		c.execute();
		}
	}

}
