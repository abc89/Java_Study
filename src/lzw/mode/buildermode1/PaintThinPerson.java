package lzw.mode.buildermode1;

import java.awt.Graphics;

public class PaintThinPerson extends PaintPersonBuilder {

	public void paintHead(Graphics g) {
		g.drawOval(270, 200,50,50);
	}

	public void paintBody(Graphics g) {
		g.drawOval(250, 250,80,100);
	}


	public void paintHand(Graphics g) {
		g.drawLine(250,300,200,350);
		g.drawLine(330,300,350,350);
	}


	public void paintFoot(Graphics g) {
		g.drawLine(280,350,200,450);
		g.drawLine(300,350,350,450);
	}

}
