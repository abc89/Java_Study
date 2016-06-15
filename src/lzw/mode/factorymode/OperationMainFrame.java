package lzw.mode.factorymode;


public class OperationMainFrame {
	
	public static void main(String[] args) {	
		new OperationMainFrame();
	}
	
	public OperationMainFrame(){
		
		factoryMode();
		
	}	

	/*
	 * 工厂模式结合反射机制
	 */
	private void factoryMode() {
		//加法工厂
		OperationFactory factory=new AddFactory();
		Operation operation=factory.createOperation();
		System.out.println(operation.getResult(11, 12));
		
		//减法工厂
	    factory=new SubFactory();
		 operation=factory.createOperation();
		System.out.println(operation.getResult(11, 12));
		
		factory=new MulFactory();
		 operation=factory.createOperation();
		System.out.println(operation.getResult(11, 12));
		
		factory=new DivFactory();
		 operation=factory.createOperation();
		System.out.println(operation.getResult(36, 12));
		
		//n次方工厂
		factory=new PowFactory();
		 operation=factory.createOperation();
		System.out.println(operation.getResult(11, 2));
	}



}
