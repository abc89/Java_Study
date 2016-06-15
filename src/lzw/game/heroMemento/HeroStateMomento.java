package lzw.game.heroMemento;

/*
 * ½ÇÉ«±¸ÍüÂ¼
 */
public class HeroStateMomento {

	private int hp;
	private int mp;
	private int attack;
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getAttack() {
		return attack;
	}
	public int getDefence() {
		return defence;
	}
	public String getName() {
		return name;
	}
	public String getAttribute() {
		return attribute;
	}
	private int defence;
	private String name;
	private String attribute;
	public HeroStateMomento(String name, int hp, int mp, int attack, int defence,
			String attribute) {
		this.hp=hp;
		this.mp=mp;
		this.name=name;
		this.attack=attack;
		this.attribute=attribute;
		this.defence=defence;
	}

}
