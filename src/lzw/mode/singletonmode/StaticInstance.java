package lzw.mode.singletonmode;

public class StaticInstance {

	private static StaticInstance instance=new StaticInstance();
	private StaticInstance(){}
	public static StaticInstance getInstance(){
		return instance;
	}
}
