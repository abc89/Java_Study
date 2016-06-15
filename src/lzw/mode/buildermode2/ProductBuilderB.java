package lzw.mode.buildermode2;

import java.awt.Graphics;

public class ProductBuilderB extends Builder {

	Product product=new Product();
	
	public void partA() {
		product.part.add("部件A2");
	}


	public void partB() {
		product.part.add("部件B2");
	}
	
	public Product getProduct() {
		
		return product;
	}

}
