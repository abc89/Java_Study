package lzw.mode.intepretermodetext;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main(){
		String ce="q weasd";
		System.out.println(ce.substring(ce.indexOf(" ")));
	}
	public static void main(String[] args) {

		//new Main();
	
	PlayContext context=new PlayContext();
	context.playText="o 2 e 0.5 g 0.5 a 3 e 0.5 g 0.5 ";
	Expression expression=null;
	//System.out.println(context.playText.length());
	while(context.playText.length()>0){
		String type=context.playText.substring(0,1);
		switch(type){
		case "o":{expression=new Scale();}break;
		case "c":
		case "d":
		case "e":
		case "f":
		case "g":
		case "a":
		case "b":
		case "p":{expression=new Note();}break;
		}
		expression.intepreter(context);
	}
	
	}

}
