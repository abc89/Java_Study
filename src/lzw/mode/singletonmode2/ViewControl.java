package lzw.mode.singletonmode2;

import javax.swing.text.View;

public class ViewControl implements Control {
	private static ViewControl control=new ViewControl();
   private MasterControl master;
   private ViewControl(){
	   System.out.println("Viewcontrol initial");
   }
   public static ViewControl getInstance() {
	   System.out.println("viewcontrol getinstance");
	   System.out.println("viewcontrol:"+control);
		return control;
	}
	public void close() {
	}
	public void start() {
		master=MasterControl.getInstance();
		master.start();
	}

	@Override
	public void parse() {
	}

}
