package lzw.mode.iteratormode;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {

	private MyIterator myIterator;
	public int count=0;
	private List<Object> items=new ArrayList<Object>();
	
	public List<Object> getItems() {
		return this.items;
	}

	public MyIterator createConcreteMyIterator() {
		return null;
	}

	public MyIterator createMyIterator() {
		
		return new ConcreteMyIterator(this);
	}

	public void add(Object item){
		items.add(item);
		count++;
	}
	
}
