package lzw.mode.iteratormode;

public class ConcreteMyIterator extends MyIterator{
 
	private ConcreteAggregate aggregate;
	private int current=0;
	public ConcreteMyIterator(ConcreteAggregate aggregate){
		this.aggregate=aggregate;
	}
	public Object first() {
		
		return aggregate.getItems().get(0);
	}

	@Override
	public Object next() {
		Object ite=null;
		if(current<aggregate.count){
			ite=aggregate.getItems().get(current);
		}
		current++;
		return ite;
	}

	
	public boolean isDone() {
		
		return current<aggregate.count?false:true;
	}

	@Override
	public Object currentItem() {
		
		return aggregate.getItems().get(current);
	}


}
