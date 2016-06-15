package lzw.mode.factorymode;

/*
 * 策略类
 */
public class OperationContext {
	private Operation operation=null;
	
	/*
	 * 策略模式
	 */
	public OperationContext(Operation operation){
		this.operation=operation;
	}
	
	/*
	 * 策略+工厂模式
	 */
	public  OperationContext(String symbol){
		switch(symbol){
		case "+":{operation=new OperationAdd();}break;
		case "-":{operation=new OperationSub();}break;
		case "*":{operation=new OperationMul();}break;
		case "/":{operation=new OperationDiv();}break;
		case "^":{operation=new OperationPow();}break;
		default:{System.out.println("无该运算符");}break;
		}
	}
	public double getResult(double num1,double num2){
   	 double result=0;
   	 result=operation.getResult(num1, num2);
   	 return result;
    } 
	
	
	
	
	
	
	
	
	
	
	
	
}
