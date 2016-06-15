package lzw.mode.intepretermodetext;

public class Note extends Expression{

	void excute(String playKey, double playValue) {
		String note="";
		switch(playKey){
		case "c":
		case "C":note="1";break;
		case "d":
		case "D":note="2";break;
		case "e":
		case "E":note="3";break;
		case "f":
		case "F":note="4";break;
		case "g":
		case "G":note="5";break;
		case "a":
		case "A":note="6";break;
		case "b":
		case "B":note="7";break;
		
		}
		System.out.print(note+" ");
	}

}
