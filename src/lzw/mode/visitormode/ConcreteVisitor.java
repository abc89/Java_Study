package lzw.mode.visitormode;

public class ConcreteVisitor extends Visitor {

	public void visitorConcreteElement1(ConcreteElement1 concreteElement1) {
		System.out.println("取得 ConcreteVisitor2 关于concreteElement1的访问 ");
	}

	public void visitorConcreteElement2(ConcreteElement2 concreteElement2) {
		System.out.println("取得 ConcreteVisitor2 关于concreteElement2的访问 ");
	}

}
