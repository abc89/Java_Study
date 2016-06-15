package lzw.mode.simplefactorymode;

/*
 * �򵥹�����
 * ������Ҫ������������
 * ��Ҫ����������̳�������
 * ֻ����OperationFactory switch �����ʵ��Ҫ�����������������
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
		default:{System.out.println("�޸������");}break;
		}
		return operation;
		
	}
}
