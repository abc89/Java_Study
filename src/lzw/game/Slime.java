	package lzw.game;
/*
 * ����ģʽ ����Slimeʵ��
 */
public class Slime extends Monster {

	//����ģʽ ������
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
		attribute="ˮ����";
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
