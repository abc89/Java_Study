package lzw.game;


import lzw.game.Battle.Battle;
import lzw.game.heroMemento.HeroStateMomento;
import lzw.game.heroMemento.HeroStateTaker;

public class Hero {

	private static Hero hero=null;
	private int hp;
	private int mp;
	private int attack;
	private int defence;
	private String name;
	private String attribute;
    private String declare;
	private static Object object=new Object();
	private Hero(){
		
	}
	public static Hero getHeroInstance(){
		if(hero==null){
			synchronized (object) {
				if(hero==null){
					hero=new Hero();
				}
			}
		}
		return hero;
		
	}
	public void heroFight(Monster monster) {

		System.out.println("Ӣ�������"+monster.name+"ս��");
	}

	public void heroRun(Monster monster) {
		
	}

	public void heroBeg(Monster monster) {
	}
	
	/*******************************���浱ǰ��ɫ״̬���ȡ����---------------����¼ģʽ************************************/
	//��ȡ��ǰҪ���������״̬
	public HeroStateMomento getCurSaveHeroState(){
		return new HeroStateMomento(name,hp,mp,attack,defence,attribute);
	}
	//�ָ�����¼�б��������״̬
	public void recoverHeroSate(HeroStateMomento heroMomento){
		hp=heroMomento.getHp();
		mp=heroMomento.getMp();
		attack=heroMomento.getAttack();
		defence=heroMomento.getDefence();
		name=heroMomento.getName();
		attribute=heroMomento.getAttribute();
	}

}
