package lzw.util.jdbctool.dbdriverconnection;

import java.sql.Connection;

/***************
 * 
 * @author zjb
 *简单工厂模式，获取不同驱动连接
 */
public  class DBConnectionFactory {
	public static JDBCConnectionPool createJDBCConnection(){
		return new JDBCConnectionPool();
	}
	public static OtherDiverConnection createOtherDiverConnection(){
		return new OtherDiverConnection();
	}
}
