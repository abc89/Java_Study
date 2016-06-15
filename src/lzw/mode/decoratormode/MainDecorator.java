package lzw.mode.decoratormode;

public class MainDecorator {

	public static void main(String[] args){
		Person person=new Person("С��");
		System.out.println("��һ��װ��");
		KuZi kuZi=new KuZi();
		ShangYi shangYi=new ShangYi();
		XieZi xieZi=new XieZi();
		kuZi.decorator(person);
		xieZi.decorator(kuZi);
		shangYi.decorator(xieZi);
		shangYi.show();
	}
}
