package lzw.mode.simplefactorymode;

/*
 * 简单工厂类
 * 若后面要加入其他运算
 * 将要新增运算类继承运算类
 * 只需在OperationFactory switch 中添加实现要添加新增运算类的语句
 * 
 */
public class OperationFactory {

	public static Operation getOperation(String symbol){
		Operation operation=null;
		switch(symbol){
		case "+":{operation=new OperationAdd();}break;
		case "-":{operation=new OperationSub();}break;
		case "*":{operation=new OperationMul();}break;
		case "/":{operation=new OperationDiv();}break;
		case "^":{operation=new OperationPow();}break;
		default:{System.out.println("无该运算符");}break;
		}
		return operation;
		
	}
}
