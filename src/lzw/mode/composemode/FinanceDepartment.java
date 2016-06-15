package lzw.mode.composemode;

public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
		
	}

	
	public void add(Company company) {
	}

	
	public void remove() {
	}


	public void show(int depth) {
		for(int i=0;i<depth;i++){
			System.out.print("---");
			}
			System.out.println(name);
	}


	public void performDuty() {
		System.out.println(name+"管理公司财务");
	}

}
