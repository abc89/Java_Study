package lzw.mode.buildermode2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BuilderModeMainFrame extends JFrame {

	
	public BuilderModeMainFrame(){
		System.out.println("产品1：部件：");
		Director director=new Director(new ProductBuilderA());
		Product productA=director.creatProduct();
		productA.show();
		System.out.println("产品2：部件：");
		director=new Director(new ProductBuilderB());
		Product productB=director.creatProduct();
		productB.show();
	}
	public static void main(String[] args) {
          new BuilderModeMainFrame();
           
	}

	
}
