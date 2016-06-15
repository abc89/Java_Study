package lzw.mode.buildermode1;

import java.awt.Graphics;

public class PaintFatPerson extends PaintPersonBuilder {


	public void paintHead(Graphics g) {
		g.drawOval(550, 100,100,100);
	}

	public void paintBody(Graphics g) {
		g.drawOval(530, 200,160,200);
	}


	public void paintHand(Graphics g) {
		g.drawLine(530,300,200,650);
		g.drawLine(690,300,850,450);
	}


	public void paintFoot(Graphics g) {
		g.drawLine(550,350,200,650);
		g.drawLine(690,350,850,450);
	}
}
