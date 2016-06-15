package lzw.game;

import lzw.game.Battle.Battle;
import lzw.game.Battle.HeroBattleAdapter;
import lzw.game.heroMemento.HeroStateTaker;

public class Main {

	public static void main(String[] args){
		CurrectMonster monsters=new CurrectMonster();
		monsters.add(Tepig.tepig);
		monsters.add(Slime.slime);
		System.out.println(monsters.getCount());
		monsters.showMonsterAttribute();
		Battle battle=HeroBattleAdapter.getHeroBattleAdapter();
		battle.fight(Tepig.tepig);
		
		HeroStateTaker taker=new HeroStateTaker();
		taker.add(Hero.getHeroInstance().getCurSaveHeroState());
		System.out.println(taker.getSize());
	}
	
}
