package lzw.mode.composemode;

public class Main {

	public static void main(String[] args){
		//˳�������ʾ˳�����
		ConcreteCompany root=new ConcreteCompany("�ܹ�˾");
		root.add(new HRDepartment("�ܹ�˾������Դ��"));
		root.add(new FinanceDepartment("�ܹ�˾����"));
		
		ConcreteCompany company1=new ConcreteCompany("�ֹ�˾");
		company1.add(new FinanceDepartment("�ֹ�˾����"));
		company1.add(new HRDepartment("�ֹ�˾������Դ��"));
		root.add(company1);
		
		ConcreteCompany partCompany1=new ConcreteCompany("�ֹ�˾�ӹ�˾1");
		partCompany1.add(new FinanceDepartment("�ֹ�˾�ӹ�˾1����"));
		partCompany1.add(new HRDepartment("�ֹ�˾�ӹ�˾1������Դ��"));
		ConcreteCompany partCompany2=new ConcreteCompany("�ֹ�˾�ӹ�˾2");
		partCompany2.add(new FinanceDepartment("�ֹ�˾�ӹ�˾2����"));
		partCompany2.add(new HRDepartment("�ֹ�˾�ӹ�˾2������Դ��"));
		
		company1.add(partCompany1);
		
		company1.add(partCompany2);
		
		root.show(1);
		
		root.performDuty();
	}
}
