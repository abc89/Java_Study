package lzw.polymorphic;

public class SubClass extends Genitor {

	private String subClass="����";
	public SubClass(String field) {
		super(field);
		
	}

	void showPrivateField() {
		System.out.println("���� public get�������ø���˽���ֶΣ�       "+getPrivateField());
		
	}

	private void showSubClassMethod(){
		System.out.println("����˽�з�����ͨ���븸�๲ͬ������ӵ�������˽���ֶΣ�    "+subClass);
	}

	
	public void showSubClassPrivateField() {
		showSubClassMethod();
	}
}
