package lzw.util.jdbctool.dboperate;

import java.sql.*;
import java.util.Map;

import lzw.util.table.*;
public  abstract class DBOperate {
	 
	  //ʵ��������ʱ�����캯�������JDBC��������
     public abstract void configureConnection();
     public void configureConnection2(Object object) {
	}
      //����public ������ſ���dbʵ�����÷���
      //���ñ�������ԣ����صõ��ı�ı��������id,name,age
       public abstract int configureTable(String tableName);
       //���е�һ�����
	  public abstract void insertOne(TableColumn colum);
	  public abstract TableColumn searchFirst(String key,String value);
	  public abstract void updateOne(TableColumn colum);
	  public abstract void deleteOne(TableColumn colum);
	  //���ű����
	  public abstract void insertBatch(Table table);
	  public abstract Table searchBatch(String key,String value);
	  //�����޸�
	  public abstract void updateBatch(Table table);
	  //����ɾ��
	  public abstract void deleteBatch(Table table);
	  ///
	 public abstract void clearAll();
	 public abstract void closeDB();
	  //Ĭ��Ϊ��Ӧ����ֵɾ��

	 public  abstract Table query();
	  public abstract boolean executeUpdate(String sql,Object table);
	public   abstract void setParams(PreparedStatement preStmt, Object[] params);
	  public abstract int getCount(String sql) throws SQLException;
}
