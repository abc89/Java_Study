package lzw.mode.simplefactorymode;


public class OperationMainFrame {
	
	public static void main(String[] args) {	
		new OperationMainFrame();
	}
	
	public OperationMainFrame(){
		
		factoryAchive();
		contextAchive();
		contextComFactoryAchive();
	}
	
	/*
	 * ����+�򵥹���
	 * �ͻ���ֻ��֪��һ����OperationContext ��ϸ��ӽ���
	 */
	private void contextComFactoryAchive() {
		OperationContext context=new OperationContext("/");
		System.out.println(context.getResult(12, 12));
	}

	/*
	 * �򵥹���ʵ�֣���ʱ�ͻ��˳���OperationFactory��Operation
     */
	private void factoryAchive() {
      OperationFactory operationFactory=new OperationFactory();   
      Operation operation=operationFactory.getOperation("^");
      System.out.println(operation.getResult(101,2));
      
	}

	/*
	 * ����ģʽ
	 * �ͻ���֪��OperationFactory �� Operation �����ɿͻ����ж�ʹ���Ǹ��㷨switch
	 */
	private void contextAchive() {
		String symbol=null;
		symbol="*";
		OperationContext context=null;
		switch(symbol){
		case "+":{ context=new OperationContext(new OperationAdd());}break;
		case "-":{ context=new OperationContext(new OperationSub());}break;
		case "*":{ context=new OperationContext(new OperationMul());}break;
		case "/":{ context=new OperationContext(new OperationDiv());}break;
		case "^":{ context=new OperationContext(new OperationPow());}break;
		default:{System.out.println("�޸������");}break;
		}
		System.out.println(context.getResult(11, 12));
	}



}
