package lzw.mode.visitormode;

public class ConcreteVisitor extends Visitor {

	public void visitorConcreteElement1(ConcreteElement1 concreteElement1) {
		System.out.println("ȡ�� ConcreteVisitor2 ����concreteElement1�ķ��� ");
	}

	public void visitorConcreteElement2(ConcreteElement2 concreteElement2) {
		System.out.println("ȡ�� ConcreteVisitor2 ����concreteElement2�ķ��� ");
	}

}
