package lzw.polymorphic;

public class SubClass extends Genitor {

	private String subClass="子类";
	public SubClass(String field) {
		super(field);
		
	}

	void showPrivateField() {
		System.out.println("父类 public get方法调用父类私有字段：       "+getPrivateField());
		
	}

	private void showSubClassMethod(){
		System.out.println("子类私有方法，通过与父类共同方法间接调用子类私有字段：    "+subClass);
	}

	
	public void showSubClassPrivateField() {
		showSubClassMethod();
	}
}
