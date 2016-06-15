package lzw.mode.visitormode;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

	private List<Element> es=new ArrayList<Element>();
	public void add(Element e){
		this.es.add(e);
	}
	public void delete(Element e){
		this.es.remove(e);
	}
	public void visitorAbout(Visitor visitor){
		for(Element e:es){
			e.accept(visitor);
		}
	}
}
