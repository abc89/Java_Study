package lzw.mode.intepretermodetext;

public class Scale extends Expression {


	void excute(String playKey, double playValue) {
		String scale="";
		int value=(int)playValue;
		switch(value){
		case 1:{scale="����";}break;
		case 2:{scale="����";}break;
		case 3:{scale="����";}break;
		}
		
		System.out.print(scale+" ");
	}

}
