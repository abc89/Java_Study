package lzw.mode.buildermode2;

import java.awt.Graphics;

public class ProductBuilderA extends Builder {

	Product product=new Product();
	
	public void partA() {
		product.part.add("����A1");
	}


	public void partB() {
		product.part.add("����B1");
	}



	public Product getProduct() {
		
		return product;
	}


	
}
