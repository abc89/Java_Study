package lzw.util.databasefactory;

import java.util.List;

 interface UserOperate {
     boolean add(User user);
    boolean update(User user);
     boolean delete(User user);
     User query(int id);
     List<User> query();
}
