package lzw.mode.visitormodetest;

/*
 * 
 * 
 * 面对 不同境遇 ，男和女 的反应状态
 */
public abstract class Action {

	//如访问男
	public abstract void showManAction(Man man);
	
	
	//访问女
   public abstract void showWonmenAction(Woman concreteElement2);


	
}
