package lzw.mode.flyweight;

public class Main {

	public Main(){
		flwString();
	}
	//String ��Ԫģʽ
	private void flwString() {
		
		//��Ԫģʽ
		String s1="qwe";//s1,s2ָ��ͬһ�ڴ浥Ԫ����ͬʵ��
		String s2="qwe";		
		System.out.println(s1==s2);//true
		//s3,s4��ͬʵ��
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
