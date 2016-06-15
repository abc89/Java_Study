package lzw.mode.buildermode2;

import java.awt.Graphics;

public class ProductBuilderA extends Builder {

	Product product=new Product();
	
	public void partA() {
		product.part.add("部件A1");
	}


	public void partB() {
		product.part.add("部件B1");
	}



	public Product getProduct() {
		
		return product;
	}


	
}
