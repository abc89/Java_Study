package lzw.game.heroMemento;

import java.util.ArrayList;
import java.util.List;

/*
 * ��ɫ״̬����
 */
public class HeroStateTaker {

	private List<HeroStateMomento> heroStates=new ArrayList<HeroStateMomento>();
	public HeroStateMomento getHeroSaveState(int i){
		HeroStateMomento heroSaveState=null;
		if(heroStates.size()>i){
			heroSaveState=heroStates.get(i);
		}
		
		return heroSaveState;
	}
	public void add(HeroStateMomento heroSaveState){
		heroStates.add(heroSaveState);
	}
	public void remove(int index){
		if(heroStates.size()>index){
			heroStates.remove(index);
		}
	}
	public int getSize(){
		return heroStates.size();
	}
}
