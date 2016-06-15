package lzw.util.databasefactory;

import java.util.List;

interface OtherOperate {

	 boolean add(Other other);
	    boolean update(Other other);
	     boolean delete(Other other);
	     User query(int id);
	     List<User> query();
}
