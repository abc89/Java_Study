package lzw.mode.intepretermode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

	Context context=new Context();
	List<AbstractExpression> list=new ArrayList<AbstractExpression>();
	list.add(new TerminalExpression());
	list.add(new NonterminalExpression());
	list.add(new TerminalExpression());
	list.add(new NonterminalExpression());
	list.add(new TerminalExpression());
	list.add(new NonterminalExpression());
	
	for(AbstractExpression e:list){
		e.intepreter(context);
		
	}
	
	
	}

}
