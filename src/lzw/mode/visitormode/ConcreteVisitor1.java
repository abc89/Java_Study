package lzw.mode.visitormode;

//具体的一种访问状态
public class ConcreteVisitor1 extends Visitor {

	
	public void visitorConcreteElement1(ConcreteElement1 concreteElement1) {
		System.out.println("取得 ConcreteVisitor1 关于concreteElement1的访问 ");
	}

	public void visitorConcreteElement2(ConcreteElement2 concreteElement2) {
		System.out.println("取得 ConcreteVisitor1 关于concreteElement2的访问 ");
	}

}
