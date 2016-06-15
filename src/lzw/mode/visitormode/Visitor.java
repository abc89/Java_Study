package lzw.mode.visitormode;

/*
 * 访问者模式使用  被访问者element数据结构稳定情况下，如人类性别数据结构 一定为为：男 和 女
 * 
 * 只需增加一个子类便增加一种访问结果。如男人 失败，成功，恋爱，同样女人  失败，成功，恋爱
 */
public abstract class Visitor {

	//如访问男
	public abstract void visitorConcreteElement1(ConcreteElement1 concreteElement1);
	
	//访问女
   public abstract void visitorConcreteElement2(ConcreteElement2 concreteElement2);

	
}
