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
		System.out.println("��������:  "+name);
		System.out.println("����hp:  "+hp);
		System.out.println("����mp:  "+mp);
		System.out.println("����attack:  "+attack);
		System.out.println("����defence:  "+defence);
		System.out.println("����attribute:  "+attribute);
		
		System.out.println("��������");
		
	}
	
	
}
