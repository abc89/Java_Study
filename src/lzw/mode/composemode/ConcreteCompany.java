package lzw.mode.composemode;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

	private List<Company> companys=new ArrayList<Company>();
	//name 父类protected字段，子类可继承，故隐式可调用
	public ConcreteCompany(String name) {
		super(name);
	
	}
	
	public void add(Company company) {
	companys.add(company);
	
	}
	public void remove() {
	
	}


	public void show(int depth) {
		for(int i=0;i<depth;i++){
		System.out.print("---");
		}
		System.out.println(name);
		for(Company c:companys){
		  c.show(depth+2);
		}
	}

	public void performDuty() {
		for(Company c:companys){
			  c.performDuty();
			}
	}



		

}
