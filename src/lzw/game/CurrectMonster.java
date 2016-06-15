package lzw.game;

import java.util.ArrayList;
import java.util.List;

public class CurrectMonster {

	private List<Monster> monsters=new ArrayList<Monster>();
	public void add(Monster monster){
		if(!monsters.contains(monster)){
		monsters.add(monster);
		}
	}
	public void remove(Monster monster){
		monsters.remove(monster);
	}
	public void showMonsterAttribute(){
		for(Monster m:monsters){
			m.display();
		}
	}
	public int getCount(){
		return monsters.size();
	}
}
