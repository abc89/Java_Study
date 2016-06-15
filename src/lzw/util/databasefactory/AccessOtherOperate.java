package lzw.util.databasefactory;

import java.util.List;

public class AccessOtherOperate implements OtherOperate {
  
	private Other other=null;
	public boolean add(Other other) {
		System.out.println("accessotherÖĞÌí¼Ó¼ÍÂ¼");
		return false;
	}

	@Override
	public boolean update(Other other) {
		
		return false;
	}

	@Override
	public boolean delete(Other other) {
		
		return false;
	}

	@Override
	public User query(int id) {
		
		return null;
	}

	@Override
	public List<User> query() {
		
		return null;
	}

}
