package lzw.mode.singletonmode2;

import java.util.ArrayList;
import java.util.List;



/**
 * 客户请求处理分控制器
 * @author e7691
 *
 */
public class RequestControl implements Control {
     private ServerLink serverLink=null;
	 private static RequestControl control=new RequestControl();
	 private static  MasterControl masterControl;
	 
	 private RequestControl(){
		 System.out.println("requestcpntrol initial");
	 }
		public void start() {
			masterControl=MasterControl.getInstance();
			 serverLink=new ServerLink();
			serverLink.start();
		}
	
	public void close() {}
	public void parse() {}
	
	
//	public static RequestControl getInstance() {
//		if(control==null){
//		synchronized (RequestControl.class) {
//			if(control==null){				
//				control=new RequestControl();
//			}
//		}
//		}
//		return control;
//	}
	public static RequestControl getInstance() {
		System.out.println("requestcontrol getinstance");
		System.out.println("requestcontrol :"+control);
	return control;
}
}
