package lzw.mode.buildermode1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BuilderModeMainFrame extends JFrame {

	private PaintFrame paintFrame;
	public BuilderModeMainFrame(){
		this.setSize(800,600);
		paintFrame=new PaintFrame();
		this.add(paintFrame);
		paintFrame.repaint();
	}
	public static void main(String[] args) {
            BuilderModeMainFrame frame=new BuilderModeMainFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class PaintFrame extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			PaintPersonDirector director=new PaintPersonDirector(new PaintThinPerson(),Color.black);
			director.paintPerson(g);
			director=new PaintPersonDirector(new PaintFatPerson(), Color.gray);
			director.paintPerson(g);
		}
	}
}
