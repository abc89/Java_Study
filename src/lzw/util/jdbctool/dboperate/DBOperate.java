package lzw.util.jdbctool.dboperate;

import java.sql.*;
import java.util.Map;

import lzw.util.table.*;
public  abstract class DBOperate {
	 
	  //实例化子类时，构造函数中添加JDBC驱动连接
     public abstract void configureConnection();
     public void configureConnection2(Object object) {
	}
      //加入public 其他类才可用db实例调用方法
      //配置表相关属性，返回得到的表的表项个数，id,name,age
       public abstract int configureTable(String tableName);
       //表中的一项操作
	  public abstract void insertOne(TableColumn colum);
	  public abstract TableColumn searchFirst(String key,String value);
	  public abstract void updateOne(TableColumn colum);
	  public abstract void deleteOne(TableColumn colum);
	  //整张表操作
	  public abstract void insertBatch(Table table);
	  public abstract Table searchBatch(String key,String value);
	  //批量修改
	  public abstract void updateBatch(Table table);
	  //批量删除
	  public abstract void deleteBatch(Table table);
	  ///
	 public abstract void clearAll();
	 public abstract void closeDB();
	  //默认为对应主键值删除

	 public  abstract Table query();
	  public abstract boolean executeUpdate(String sql,Object table);
	public   abstract void setParams(PreparedStatement preStmt, Object[] params);
	  public abstract int getCount(String sql) throws SQLException;
}
