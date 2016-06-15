package lzw.mode.visitormodetest;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

	private List<Person> persons=new ArrayList<Person>();
	public void add(Person e){
		this.persons.add(e);
	}
	public void delete(Person e){
		this.persons.remove(e);
	}
	public void visitorAbout(Action action){
		for(Person e:persons){
			e.showAction(action);
		}
	}
}
