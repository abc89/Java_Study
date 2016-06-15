package lzw.mode.factorymode;

public class DivFactory extends OperationFactory{

	public Operation createOperation() {
		Operation operation=null;
		operation=new OperationDiv();
		return operation;
	}

}