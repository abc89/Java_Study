package lzw.util.jdbctool.dboperate;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class DBOperateFactory {

	public static String filePath="DB.properties";
	public static DBOperate createDBOperate(){
		DBOperate dbOperate=null;
		String calssName=null;
		try {
			File file=new File(filePath);
			FileInputStream fin=new FileInputStream(file);
			Properties properties=new Properties();
			properties.load(fin);
			calssName = properties.getProperty("DBOperate");
			Class c=Class.forName(calssName);
			Object operate=c.newInstance();
			dbOperate=(DBOperate)operate;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return dbOperate;
		
	}

}
