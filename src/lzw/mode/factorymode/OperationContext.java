package lzw.mode.factorymode;

/*
 * ������
 */
public class OperationContext {
	private Operation operation=null;
	
	/*
	 * ����ģʽ
	 */
	public OperationContext(Operation operation){
		this.operation=operation;
	}
	
	/*
	 * ����+����ģʽ
	 */
	public  OperationContext(String symbol){
		switch(symbol){
		case "+":{operation=new OperationAdd();}break;
		case "-":{operation=new OperationSub();}break;
		case "*":{operation=new OperationMul();}break;
		case "/":{operation=new OperationDiv();}break;
		case "^":{operation=new OperationPow();}break;
		default:{System.out.println("�޸������");}break;
		}
	}
	public double getResult(double num1,double num2){
   	 double result=0;
   	 result=operation.getResult(num1, num2);
   	 return result;
    } 
	
	
	
	
	
	
	
	
	
	
	
	
}
