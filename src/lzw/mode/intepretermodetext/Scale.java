package lzw.mode.intepretermodetext;

public class Scale extends Expression {


	void excute(String playKey, double playValue) {
		String scale="";
		int value=(int)playValue;
		switch(value){
		case 1:{scale="µÕ“Ù";}break;
		case 2:{scale="÷–“Ù";}break;
		case 3:{scale="∏ﬂ“Ù";}break;
		}
		
		System.out.print(scale+" ");
	}

}
