package lzw.mode.flyweight;

public class Main {

	public Main(){
		flwString();
	}
	//String 享元模式
	private void flwString() {
		
		//享元模式
		String s1="qwe";//s1,s2指向同一内存单元，相同实例
		String s2="qwe";		
		System.out.println(s1==s2);//true
		//s3,s4不同实例
		String s3=new String("qwe");
		String s4="qwe";
		System.out.println(s3==s4);//false
		
		//s5,s6
		String s5=new String("qwe");
		String s6=new String("qwe");
		System.out.println(s5==s6);//false
	}
	public static void main(String[] args) {
		new Main();
	}

}
