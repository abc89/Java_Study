package lzw.mode.commandmode;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command> orders=new ArrayList<Command>();
	public void setOrder(Command command){
		orders.add(command);
		
	}
	//�ͻ��µ���ϣ�����Ա ֪ͨ�����ߣ���ʦ��ִ������
	public void notifyR(){
		for(Command c:orders){
		c.execute();
		}
	}

}
