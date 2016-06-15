package lzw.mode.mediatorodetest;

public abstract class Countrys {

	protected UniteNations uniteNations;
	public  Countrys(UniteNations uniteNations){
		this.uniteNations=uniteNations;
		
	}
	abstract void send(String msg);
	
}
