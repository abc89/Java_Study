package lzw.mode.visitormode;

//�����һ�ַ���״̬
public class ConcreteVisitor1 extends Visitor {

	
	public void visitorConcreteElement1(ConcreteElement1 concreteElement1) {
		System.out.println("ȡ�� ConcreteVisitor1 ����concreteElement1�ķ��� ");
	}

	public void visitorConcreteElement2(ConcreteElement2 concreteElement2) {
		System.out.println("ȡ�� ConcreteVisitor1 ����concreteElement2�ķ��� ");
	}

}
