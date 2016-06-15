package lzw.mode.decoratormode;

public class MainDecorator {

	public static void main(String[] args){
		Person person=new Person("小明");
		System.out.println("第一种装扮");
		KuZi kuZi=new KuZi();
		ShangYi shangYi=new ShangYi();
		XieZi xieZi=new XieZi();
		kuZi.decorator(person);
		xieZi.decorator(kuZi);
		shangYi.decorator(xieZi);
		shangYi.show();
	}
}
