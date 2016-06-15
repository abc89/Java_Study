package lzw.mode.decoratormode;

public class Finery extends Person {

	public Person component;
	public Finery(String name) {
		super(name);	
	}
	public Finery(){}
   public void decorator(Person component){

	   this.component=component;
   }
	public void show() {
		if(component!=null){
		component.show();
		}
	}

}
