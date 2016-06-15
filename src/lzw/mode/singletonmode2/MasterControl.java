package lzw.mode.singletonmode2;

import javax.swing.text.View;



/**
 * 服务器总控制
 * @author e7691
 *
 */
public class MasterControl implements Control {
    private static MasterControl master=new MasterControl();
    private ViewControl viewControl;
    private static RequestControl requestControl;
    private MasterControl(){
    	System.out.println("master inital");
    }
    public static MasterControl getInstance() {
    	System.out.println("mastercontrol getinstance");
    	System.out.println("mastercontrol:"+master);
		return master;
	}
	public void close() {
    	requestControl.close();
		viewControl.close();
	}
	public void start() {
	viewControl=ViewControl.getInstance();
	  requestControl=RequestControl.getInstance();
	  requestControl.start();
	}
    public void parse() {
	}


}
