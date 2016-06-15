package lzw.mode.factorymode;

public class SubFactory extends OperationFactory{

	public Operation createOperation() {
		Operation operation=null;
		operation=new OperationSub();
		return operation;
	}

}

