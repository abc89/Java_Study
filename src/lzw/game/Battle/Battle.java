package lzw.game.Battle;

import lzw.game.Monster;

public interface Battle {
   Monster monster=null;
	void fight(Monster monster);
	void run(Monster monster);
	void beg(Monster monster);
}
