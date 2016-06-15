package lzw.mode.factorymode;

public class PowFactory extends OperationFactory{

	public Operation createOperation() {
		Operation operation=null;
		operation=new OperationPow();
		return operation;
	}

}
