package lzw.mode.composemode;

public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
		
	}

	@Override
	public void add(Company company) {
	}

	@Override
	public void remove() {
	}

	@Override
	public void show(int depth) {
		for(int i=0;i<depth;i++){
			System.out.print("---");
			}
			System.out.println(name);
	}

	@Override
	public void performDuty() {
		System.out.println(name+"员工管理，招纳贤士");
	}

}
