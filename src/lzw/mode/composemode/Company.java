package lzw.mode.composemode;

/*
 * ���ģʽ
 * �ܹ�˾��ֹ�˾
 * ��˾�벿��
 * 
 * ʹ�ó�����
 * ���ֲ���������Ĳ�νṹ
 * ���ɺ�����϶����뵥�����Ĳ�ͬ
 * ͳһʹ����Ͻṹ�����ж���
 * 
 */
public abstract class Company {
	//name ����protected�ֶΣ�����ɼ̳У�����ʽ�ɵ���
	protected String name;
  public Company(String name){
	  this.name=name;
  }
  public abstract void add(Company company);
  public abstract void remove();
  public abstract void show(int depth);
  public abstract void performDuty();
  
}
