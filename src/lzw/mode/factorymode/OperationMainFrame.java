package lzw.mode.factorymode;


public class OperationMainFrame {
	
	public static void main(String[] args) {	
		new OperationMainFrame();
	}
	
	public OperationMainFrame(){
		
		factoryMode();
		
	}	

	/*
	 * ����ģʽ��Ϸ������
	 */
	private void factoryMode() {
		//�ӷ�����
		OperationFactory factory=new AddFactory();
		Operation operation=factory.createOperation();
		System.out.println(operation.getResult(11, 12));
		
		//��������
	    factory=new SubFactory();
		 operation=factory.createOperation();
		System.out.println(operation.getResult(11, 12));
		
		factory=new MulFactory();
		 operation=factory.createOperation();
		System.out.println(operation.getResult(11, 12));
		
		factory=new DivFactory();
		 operation=factory.createOperation();
		System.out.println(operation.getResult(36, 12));
		
		//n�η�����
		factory=new PowFactory();
		 operation=factory.createOperation();
		System.out.println(operation.getResult(11, 2));
	}



}
