package lzw.mode.visitormodetest;

public class Main {

	public static void main(String[] args){
		ObjectStructure structure=new ObjectStructure();
		
		FailAction action1=new FailAction();
		SuccessAction action2=new SuccessAction();
		AmativnessAction action3=new AmativnessAction();
		
		Man man=new Man();
		Woman woman=new Woman();
		
		structure.add(man);
		structure.add(woman);
		structure.visitorAbout(action1);
		structure.visitorAbout(action2);
		structure.visitorAbout(action3);
	}
}
