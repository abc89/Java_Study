package lzw.mode.visitormode;

/*
 * ������ģʽʹ��  ��������element���ݽṹ�ȶ�����£��������Ա����ݽṹ һ��ΪΪ���� �� Ů
 * 
 * ֻ������һ�����������һ�ַ��ʽ���������� ʧ�ܣ��ɹ���������ͬ��Ů��  ʧ�ܣ��ɹ�������
 */
public abstract class Visitor {

	//�������
	public abstract void visitorConcreteElement1(ConcreteElement1 concreteElement1);
	
	//����Ů
   public abstract void visitorConcreteElement2(ConcreteElement2 concreteElement2);

	
}
