package lzw.mode.composemode;

public class Main {

	public static void main(String[] args){
		//顺序调换显示顺序调换
		ConcreteCompany root=new ConcreteCompany("总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司财务部"));
		
		ConcreteCompany company1=new ConcreteCompany("分公司");
		company1.add(new FinanceDepartment("分公司财务部"));
		company1.add(new HRDepartment("分公司人力资源部"));
		root.add(company1);
		
		ConcreteCompany partCompany1=new ConcreteCompany("分公司子公司1");
		partCompany1.add(new FinanceDepartment("分公司子公司1财务部"));
		partCompany1.add(new HRDepartment("分公司子公司1人力资源部"));
		ConcreteCompany partCompany2=new ConcreteCompany("分公司子公司2");
		partCompany2.add(new FinanceDepartment("分公司子公司2财务部"));
		partCompany2.add(new HRDepartment("分公司子公司2人力资源部"));
		
		company1.add(partCompany1);
		
		company1.add(partCompany2);
		
		root.show(1);
		
		root.performDuty();
	}
}
