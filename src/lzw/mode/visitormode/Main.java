package lzw.mode.visitormode;

public class Main {

	public static void main(String[] args){
		ObjectStructure structure=new ObjectStructure();
		
		ConcreteVisitor1 visitor1=new ConcreteVisitor1();
		ConcreteVisitor2 visitor2=new ConcreteVisitor2();
		
		ConcreteElement1 element1=new ConcreteElement1();
		ConcreteElement2 element2=new ConcreteElement2();
		
		structure.add(element1);
		structure.add(element2);
		structure.visitorAbout(visitor1);
		structure.delete(element2);
		structure.visitorAbout(visitor2);
	}
}
