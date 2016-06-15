package lzw.mode.buildermode2;

import java.awt.Color;
import java.awt.Graphics;

public class Director {
  private Builder builder=null;
private Color color;
  public Director(Builder builder){
	
	  this.builder=builder;
  }
  public Product creatProduct(){
	 
	builder.partA();
	builder.partB();
	return builder.getProduct();
  }
}
