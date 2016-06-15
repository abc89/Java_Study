package lzw.mode.buildermode1;

import java.awt.Color;
import java.awt.Graphics;

public class PaintPersonDirector {
  private PaintPersonBuilder builder=null;
private Color color;
  public PaintPersonDirector(PaintPersonBuilder builder,Color color){
	  this.color=color;
	  this.builder=builder;
  }
  public void paintPerson(Graphics g){
	  g.setColor(color);
	  builder.paintHead(g);
	  builder.paintBody(g);
	  builder.paintHand(g);
	  builder.paintFoot(g);
  }
}
