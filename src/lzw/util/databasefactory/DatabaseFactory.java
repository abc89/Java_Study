package lzw.util.databasefactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DatabaseFactory {

	public String DB="sql";
	public static File file=new File("useroperate.properties");
//	public UserOperate createUserOperate(){
//		UserOperate userOperate=null;
//		switch(DB){
//		case "sql":{
//			userOperate=new SqlUserOperate();
//		}break;
//		case "access":{
//			userOperate=new AccessUserOperate();
//		}break;
//		}
//		return userOperate;
//		
//	}
//	public OtherOperate createOtherOperate(){
//		OtherOperate otherOperate=null;
//		switch(DB){
//		case "sql":{
//			 otherOperate=new SqlOtherOperate();
//		}break;
//		case "access":{
//			 otherOperate=new AccessOtherOperate();
//		}break;
//		}
//		return  otherOperate;
//		
//	}
	public static UserOperate createUserOperate(){
	UserOperate userOperate=null;
	String calssName=null;
	try {
		FileInputStream fin=new FileInputStream(file);
		Properties properties=new Properties();
		properties.load(fin);
		calssName = properties.getProperty("user");
		Class c=Class.forName(calssName);
		Object operate=c.newInstance();
		userOperate=(UserOperate)operate;
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return userOperate;
	
}
public static OtherOperate createOtherOperate(){
	OtherOperate otherOperate=null;
	String calssName=null;
	try {
		FileInputStream fin=new FileInputStream(file);
		Properties properties=new Properties();
		properties.load(fin);
		calssName = properties.getProperty("other");
		Class c=Class.forName(calssName);
		Object operate=c.newInstance();
		otherOperate=(OtherOperate)operate;
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return  otherOperate;
	
}
}
