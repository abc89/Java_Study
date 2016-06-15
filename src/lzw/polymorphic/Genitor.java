package lzw.polymorphic;

public abstract class Genitor {

	private String prvateField;
	protected String protectedField;
	public Genitor(String field){
		this.protectedField=field;
	}
	public String getPrivateField(){
		return protectedField;
	}
	public void setPrivateField(String field){
		this.protectedField=field;
	}
	abstract void showPrivateField();
	abstract void showSubClassPrivateField();
}
