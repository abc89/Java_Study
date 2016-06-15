package lzw.util.jdbctool.dbdriverconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class JDBCConnectionPool implements DataSource{

	private static LinkedList<Connection> listConnections = new LinkedList<Connection>();
	private static String JDBCFilePath="diver.properties";
	private  String DBDRIVER;
	private  String DBURL;
	private  String DBUSER;
	private  String DBPASSWORD;
	/****************************Mysal JDBC���� ��ȡ����********************************/
	public  Connection getMysqlConnection(){
		    configureJDBCDMysql();
	    	Connection con=null;
	    	   try{
	    	   Class.forName(DBDRIVER);
	    	   con= DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
	    	  System.out.println("connection�����ɹ�");
	    	   }catch(Exception e){
	    			e.printStackTrace();
	    	   }
	   		   
	    		    return con;   	   
	       }
	//�����ļ�
	private void configureJDBCDMysql(){
		try {
			File file=new File(JDBCFilePath);
			FileInputStream fin=new FileInputStream(file);
			Properties properties=new Properties();
			properties.load(fin);		 
			DBDRIVER=properties.getProperty("JDBCDBDRIVER");
			DBURL=properties.getProperty("JDBCDBURL");
			DBUSER=properties.getProperty("JDBCDBUSER");
			DBPASSWORD=properties.getProperty("JDBCDBPASSWORD");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	/*************************************************************************/
	@Override
	public PrintWriter getLogWriter() throws SQLException {
		
		return null;
	}
	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
	}
	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
	}
	@Override
	public int getLoginTimeout() throws SQLException {
		
		return 0;
	}
	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		
		return null;
	}
	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		
		return null;
	}
	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		
		return false;
	}
	@Override
	public Connection getConnection() throws SQLException {
		 //������ݿ����ӳ��е����Ӷ���ĸ�������0
		          if (listConnections.size()>0) {
		             //��listConnections�����л�ȡһ�����ݿ�����
		             final Connection conn = listConnections.removeFirst();
		          System.out.println("listConnections���ݿ����ӳش�С��" + listConnections.size());
		            //����Connection����Ĵ������
		            return (Connection) Proxy.newProxyInstance(JDBCConnectionPool.class.getClassLoader(), conn.getClass().getInterfaces(), new InvocationHandler() {
						
						
						public Object invoke(Object proxy, Method method, Object[] args)
								throws Throwable {
		              
		               
		                     if(!method.getName().equals("close")){
		                        return method.invoke(conn, args);
		                    }else{
		                         //������õ���Connection�����close�������Ͱ�conn�������ݿ����ӳ�
		                         listConnections.add(conn);
		                         System.out.println(conn + "������listConnections���ݿ����ӳ��ˣ���");
		                        System.out.println("listConnections���ݿ����ӳش�СΪ" + listConnections.size());
		                        return null;
		                    }
		                 }
		             });
		         }else {
	             throw new RuntimeException("�Բ������ݿ�æ");
		        }
	}
	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		
		return null;
	}
	
	
	/********************************** JDBC access�����Լ�����***************************************/
	/*
	 * 
	 * 
	 * 
	 */
	/*********************************************************************/
	
	/*************************************jdbc orale************************/
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	/***************************************************************/
}
