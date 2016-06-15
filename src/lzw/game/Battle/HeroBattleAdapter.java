package lzw.game.Battle;

import lzw.game.Hero;
import lzw.game.Monster;

public class HeroBattleAdapter implements Battle {

	private Hero hero=Hero.getHeroInstance();
	private static HeroBattleAdapter adapter=null;
	private static Object object=new Object();
	private HeroBattleAdapter(){
		
	}
	public static HeroBattleAdapter getHeroBattleAdapter(){
		if(adapter==null){
			synchronized (object) {
				if(adapter==null){
					adapter=new HeroBattleAdapter();
				}
			}
		}
		return adapter;
	}
	public void fight(Monster monster) {
		hero.heroFight(monster);
	}

	public void run(Monster monster) {
		hero.heroRun(monster);
	}
	public void beg(Monster monster) {
	hero.heroBeg(monster);
	}

}
