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
	 * 策略+简单工厂
	 * 客户端只需知道一个类OperationContext 耦合更加降低
	 */
	private void contextComFactoryAchive() {
		OperationContext context=new OperationContext("/");
		System.out.println(context.getResult(12, 12));
	}

	/*
	 * 简单工厂实现，此时客户端出现OperationFactory和Operation
     */
	private void factoryAchive() {
      OperationFactory operationFactory=new OperationFactory();   
      Operation operation=operationFactory.getOperation("^");
      System.out.println(operation.getResult(101,2));
      
	}

	/*
	 * 策略模式
	 * 客户端知道OperationFactory 和 Operation 并且由客户端判断使用那个算法switch
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
		default:{System.out.println("无该运算符");}break;
		}
		System.out.println(context.getResult(11, 12));
	}



}
