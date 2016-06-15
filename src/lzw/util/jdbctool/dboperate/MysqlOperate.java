package lzw.util.jdbctool.dboperate;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import lze.englishstudy.EnglishWord;
import lzw.util.jdbctool.dbdriverconnection.DBConnectionFactory;
import lzw.util.table.*;

public class MysqlOperate extends DBOperate {
//�����ļ�·��
	private String filePath="DB.properties";
	//�������ӱ���
	private Connection con=null;
	
	//�������������
	private String tableName;//����
	private String[] keys;//��������
	private int keyscount;//�������
	private boolean autoIncrease=true;//�����Զ����ӣ�Ĭ����
	
	
	public MysqlOperate(){
		
	}
	/************************�������ݿ������Ҫ�����ı�*****************/
	//����JDBC����
	public void configureConnection() {
		//������ݿ�����
		this.con=DBConnectionFactory.createJDBCConnection().getMysqlConnection();
		
	}
	//���ñ�,���ر��������id,name,age.....
	public int configureTable(String tableName){
		configureConnection();
				try {
					File file=new File(filePath);
					FileInputStream fin=new FileInputStream(file);
					Properties properties=new Properties();
					properties.load(fin);
					 this.tableName=tableName;
					String keys1=properties.getProperty(tableName);
					String[] keys2=keys1.split(",");
					this.keys=keys2;
					this.keyscount=keys.length;
					String autoInc=properties.getProperty(tableName+"autoincrease");
					if(autoInc.compareTo("false")==0){
						this.autoIncrease=false;
					}else if(autoInc.compareTo("true")==0){
						this.autoIncrease=true;
					}
					else{
						System.out.println("�����úñ������ļ��������Զ������Ƿ�true?/false?");
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				closeDB();
				return keyscount;
	}
	
    /****************************************************************/  
	
	
	
	
	/***************************************������**********************************/
	//��ձ�
	public void clearAll() {
		configureConnection();
		try{
			PreparedStatement pState=con.prepareStatement(MySqlSentence.getClearAll(tableName));
			pState.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		closeDB();
	}
	
	public void closeDB() {
		if(con!=null){
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//�Զ�����ɲ�����
       public void executeUpdate(String sql,Object... params){
    	  configureConnection();
    	   PreparedStatement preStmt=null;
    	   try{
    		  
    		   preStmt=con.prepareStatement(sql);
    		   setParams(preStmt,params);
    		   preStmt.executeUpdate();
    	   }catch(Exception e){
    		   System.out.println("�޸�ʧ��");
    	   }
       closeDB();
       }
	
	public int getCount(String sql) throws SQLException{
		configureConnection();
 	   Statement stmt=null;
 	   ResultSet rs=null;
 	   int statu=0;
 	   try{
 		   stmt=con.createStatement();
 		   rs=stmt.executeQuery(sql);
 		   if(rs.next()){
 			   statu=rs.getInt(1);
 		   }
 		   return statu;
 	   }
 	  finally{
 		  closeDB();
		 
		   if(stmt!=null){
			stmt.close();}	   
		   if(rs!=null){
				rs.close();}	   
	   }
	}

	public void setParams(PreparedStatement preStmt, Object[] params) {
		configureConnection();
		if(params==null||params.length==0){
			return;
		}
		for(int i=0;i<params.length;i++){
			Object param=params[i];
			try{
			if(param==null){
				preStmt.setNull(i, Types.NULL);
			}
			if(param instanceof Integer){
				preStmt.setInt(i, (Integer)param);
			}
			if(param instanceof String){
				preStmt.setString(i, (String)param);
			}
			}catch(Exception e){}
		}
		closeDB();
	}
	public void operate(Connection con,String sql){
		configureConnection();
		PreparedStatement preStmt;
		try {
			preStmt = con.prepareStatement(sql);
			preStmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		closeDB();
	}
	public Table query(){
	configureConnection();
	 	   Statement stmt=null;
	 	   ResultSet rs=null;
	 	   int statu=0;
	 	   try{
	 		
	 		   stmt=con.createStatement();
	 		   rs=stmt.executeQuery(MySqlSentence.getQuery(tableName));
	 		   while(rs.next()){
	 			   System.out.println(rs.getString("Teacher_Username"));
	 		   }
	 	   }catch(Exception e){
	 		   e.printStackTrace();
	 	   }
	 	
	 	 closeDB();
		return null;
	}
	public boolean executeUpdate(String sql, Object table) {
		
		return false;
	}
	
	/*********************************�������****************************/
	
	
	public void insertOne(TableColumn table) {
		configureConnection();
		Object[] params=new Object[keys.length];
		for(int i=0;i<table.length;i++){
		  if(i<keys.length){
			  params[i]=table.getValueByIndex(i);
			  System.out.println(table.getValueByIndex(i));
		  }
		}
		try{
			System.out.println(this.autoIncrease);
			PreparedStatement pState=con.prepareStatement(MySqlSentence.getInsert(this.autoIncrease,tableName, keys, params));
			pState.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		closeDB();
	}

	//���ط��������ĵ�һ��
	public TableColumn searchFirst(String key, String value) {
		configureConnection();
		TableColumn<String, String> colum=new TableColumn<String, String>();
		    Statement stmt=null;
	 	   ResultSet rs=null;
	 	   try{
	 		
	 		   stmt=con.createStatement();
	 		   rs=stmt.executeQuery(MySqlSentence.getSearch(tableName,key,value));
	 		   if(rs.next()){
	 			for(int i=0;i<keys.length;i++){
	 				colum.add(keys[i],rs.getString(keys[i]));
	 			
	 			}
	 		   }
	 	   }catch(Exception e){
	 		   e.printStackTrace();
	 	   }
	 	   closeDB();
	 	   return colum;
	}
	


	public void deleteOne(TableColumn colum) {
		configureConnection();
		String value=colum.getValueByIndex(0).toString();
		String key=keys[0];
		try{
			PreparedStatement pState=con.prepareStatement(MySqlSentence.getDeleteTable(tableName, key, value));
			pState.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		closeDB();
	}


//�޸�����
	public void updateOne(TableColumn table) {
		configureConnection();
		Object[] params=new Object[keys.length];
		for(int i=0;i<table.length;i++){
		  if(i<keys.length){
			  params[i]=table.getValueByIndex(i);
		  }
		}
		try{
			PreparedStatement pState=con.prepareStatement(MySqlSentence.getUpdateTable(tableName, keys, params));
			pState.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		closeDB();
	}
	
	public void deleteOne(Table table) {
		configureConnection();
		String key=keys[0];
		for(int i=0;i<table.length;i++){
			String value=table.getTableColumByIndex(i).getValueByIndex(0).toString();
		
		try{
			PreparedStatement pState=con.prepareStatement(MySqlSentence.getDeleteTable(tableName, key, value));
			pState.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		}
		closeDB();
	}
	
	
	/*****************************���ű���� ��������*******************************/
	public void insertBatch(Table table) {
		configureConnection();
		Object[] params=new Object[keys.length];
		for(int i=0;i<table.length;i++){
			TableColumn colum=table.getTableColumByIndex(i);
			for(int i1=0;i1<colum.length;i1++){
		  if(i1<keys.length){
			  params[i1]=colum.getValueByIndex(i1);
		  }
			}
			try{
				PreparedStatement pState=con.prepareStatement(MySqlSentence.getInsert(this.autoIncrease,tableName, keys, params));
				pState.executeUpdate();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		closeDB();
//		User user=(User)table;
//		Object[] params=new Object[keys.length];
//		params[0]=user.getTeacher_ID();
//		params[1]=user.getTeacher_Username();
//		params[2]=user.getTeacher_Password();
//		params[3]=user.getTeacher_Name();
//	    params[4]=user.getTeacher_Sex();
//	    params[5]=user.getTeacher_Tel();
	}
	//���ط���������������
	public Table searchBatch(String key, String value) {
		configureConnection();
		Table table=new Table();
		 Statement stmt=null;
	 	   ResultSet rs=null;
	 	   try{
	 		
	 		   stmt=con.createStatement();
	 		   rs=stmt.executeQuery(MySqlSentence.getSearch(tableName,key,value));
	 		   while(rs.next()){
	 			   TableColumn<String, String> tableColum=new TableColumn<String, String>();
	 			for(int i=0;i<keys.length;i++){
	 				tableColum.add(keys[i],rs.getString(keys[i]));
	 			
	 			}
	 			table.add(tableColum);
	 		   }
	 	   }catch(Exception e){
	 		   e.printStackTrace();
	 	   }
	 	  closeDB();
	 	   return table;
	}
	
	public void updateBatch(Table table) {
		configureConnection();
		Object[] params=new Object[keys.length];
		for(int i=0;i<table.length;i++){
			TableColumn colum=table.getTableColumByIndex(i);
			for(int i1=0;i1<colum.length;i1++){
		  if(i1<keys.length){
			  params[i1]=colum.getValueByIndex(i1);
		  }
			}
			try{
			PreparedStatement pState=con.prepareStatement(MySqlSentence.getUpdateTable(tableName, keys, params));
			pState.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
			
		}
		closeDB();
	}


	//ɾ��������¼
	public void deleteBatch(Table table) {
		configureConnection();
		for(int i=0;i<table.length;i++){
			TableColumn colum=table.getTableColumByIndex(i);
		String value=colum.getValueByIndex(0).toString();
		String key=keys[0];
		try{
			PreparedStatement pState=con.prepareStatement(MySqlSentence.getDeleteTable(tableName, key, value));
			pState.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		}
		closeDB();
	}
	


	
/*******************************************************************************/
}
