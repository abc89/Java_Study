package lzw.mode.iteratormode;

public class Main {

	public static void main(String[] args) {

		ConcreteAggregate aggregate=new ConcreteAggregate();
		aggregate.add("1ºÅ");
		aggregate.add("2ºÅ");
		aggregate.add("3ºÅ");
		aggregate.add("4ºÅ");
		aggregate.add("5ºÅ");
		aggregate.add("6ºÅ");
		aggregate.add(17);
		MyIterator iterator=new ConcreteMyIterator(aggregate);
		
		while(!iterator.isDone()){
			System.out.println(iterator.next());
			
		}
	}

}
