package lzw.mode.visitormode;

//另一种具体访问状态
public class ConcreteVisitor2 extends Visitor {

	public void visitorConcreteElement1(ConcreteElement1 concreteElement1) {
		System.out.println("取得 ConcreteVisitor2 关于concreteElement1的访问 ");
	}

	public void visitorConcreteElement2(ConcreteElement2 concreteElement2) {
		System.out.println("取得 ConcreteVisitor2 关于concreteElement2的访问 ");
	}

}
