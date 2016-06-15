package lzw.game;

public abstract class Monster {

	protected int hp;
	protected int mp;
	protected int attack;
	protected int defence;
	protected String name;
	protected String attribute;
    protected String declare;
	abstract void setAttribute();
	public void display(){
		System.out.println("怪物名称:  "+name);
		System.out.println("怪物hp:  "+hp);
		System.out.println("怪物mp:  "+mp);
		System.out.println("怪物attack:  "+attack);
		System.out.println("怪物defence:  "+defence);
		System.out.println("怪物attribute:  "+attribute);
		
		System.out.println("怪物描述");
		
	}
	
	
}
