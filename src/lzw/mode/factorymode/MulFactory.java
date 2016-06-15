package lzw.mode.factorymode;

public class MulFactory extends OperationFactory{

	public Operation createOperation() {
		Operation operation=null;
		operation=new OperationMul();
		return operation;
	}

}