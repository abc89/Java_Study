	package lzw.game;
/*
 * 单例模式 产生Slime实例
 */
public class Slime extends Monster {

	//单例模式 方法二
	public static Slime slime=new Slime();
	public Slime(){
		setAttribute();
	}

	void setAttribute() {
		hp=12;
		mp=22;
		defence=33;
		attack=23;
		name="hello";
		attribute="水属性";
	}

	
	//private static Slime slime=null;
	//private static Object object=new Object();
//	public static Monster getMonster() {
//		if(slime==null){
//		synchronized (object) {			
//			if(slime==null){
//				slime=new Slime();
//			}
//		}
//		}
//		return slime;
//	}
//

	

	
}
