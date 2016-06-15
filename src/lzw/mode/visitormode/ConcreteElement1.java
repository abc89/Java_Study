package lzw.mode.visitormode;

public class ConcreteElement1 extends Element {

	
	public void accept(Visitor visitor) {
		
		visitor.visitorConcreteElement1(this);
	}


	void Operate() {
	}

}
