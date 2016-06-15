package lzw.mode.singletonmode;

import javax.swing.text.View;



/**
 * 服务器总控制
 * @author e7691
 *
 */
public class MasterControl implements Control {
    private static MasterControl master=new MasterControl();
    private ViewControl viewControl=ViewControl.getInstance();
    private static RequestControl requestControl=RequestControl.getInstance();
    private MasterControl(){
    	System.out.println("master inital");
    }
    public static MasterControl getInstance() {
    	System.out.println("mastercontrol getinstance");
    	System.out.println("mastercontrol.requescontrol"+requestControl);
		return master;
	}
	public void close() {
    	requestControl.close();
		viewControl.close();
	}
	public void start() {
	  requestControl.start();
	}
    public void parse() {
	}


}
