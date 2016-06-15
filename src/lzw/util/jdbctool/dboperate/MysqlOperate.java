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
//配置文件路径
	private String filePath="DB.properties";
	//驱动连接变量
	private Connection con=null;
	
	//操作表相关属性
	private String tableName;//表名
	private String[] keys;//表项数组
	private int keyscount;//表项个数
	private boolean autoIncrease=true;//主键自动增加，默认是
	
	
	public MysqlOperate(){
		
	}
	/************************配置数据库和所所要操作的表*****************/
	//配置JDBC连接
	public void configureConnection() {
		//获得数据库连接
		this.con=DBConnectionFactory.createJDBCConnection().getMysqlConnection();
		
	}
	//配置表,返回表项个数，id,name,age.....
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
						System.out.println("请配置好表配置文件中主键自动增加是否？true?/false?");
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				closeDB();
				return keyscount;
	}
	
    /****************************************************************/  
	
	
	
	
	/***************************************操作表**********************************/
	//清空表
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
	//自定义如可操作表
       public void executeUpdate(String sql,Object... params){
    	  configureConnection();
    	   PreparedStatement preStmt=null;
    	   try{
    		  
    		   preStmt=con.prepareStatement(sql);
    		   setParams(preStmt,params);
    		   preStmt.executeUpdate();
    	   }catch(Exception e){
    		   System.out.println("修改失败");
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
	
	/*********************************表单项操作****************************/
	
	
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

	//返回符合条件的第一行
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


//修改数据
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
	
	
	/*****************************整张表操作 批量操作*******************************/
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
	//返回符合条件的所有行
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


	//删除多条记录
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
