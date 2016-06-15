package lzw.mode.buildermode2;

import java.util.ArrayList;
import java.util.List;

public class Product {
   List<String> part=new ArrayList<String>();
   public void show(){
	   for(String p:part){
		   System.out.println(p);
	   }
   }
}
