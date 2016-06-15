package lzw.mode.factorymode;

public class AddFactory extends OperationFactory{

	public Operation createOperation() {
		Operation operation=null;
		operation=new OperationAdd();
		return operation;
	}

}
