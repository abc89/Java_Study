package lzw.mode.commandmodetest;

import java.util.ArrayList;
import java.util.List;
//·şÎñÉú
public class Invoker {
	private List<Command> orders=new ArrayList<Command>();
	public void setOrder(Command command){
		orders.add(command);
		
	}
	public void notifyR(){
		for(Command c:orders){
		c.execute();
		}
	}
	public void cancellOrder(Command com){
		orders.remove(com);
	}

}
