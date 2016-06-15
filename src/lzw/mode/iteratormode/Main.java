package lzw.mode.iteratormode;

public class Main {

	public static void main(String[] args) {

		ConcreteAggregate aggregate=new ConcreteAggregate();
		aggregate.add("1��");
		aggregate.add("2��");
		aggregate.add("3��");
		aggregate.add("4��");
		aggregate.add("5��");
		aggregate.add("6��");
		aggregate.add(17);
		MyIterator iterator=new ConcreteMyIterator(aggregate);
		
		while(!iterator.isDone()){
			System.out.println(iterator.next());
			
		}
	}

}
