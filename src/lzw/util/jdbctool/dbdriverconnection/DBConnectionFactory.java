package lzw.util.jdbctool.dbdriverconnection;

import java.sql.Connection;

/***************
 * 
 * @author zjb
 *�򵥹���ģʽ����ȡ��ͬ��������
 */
public  class DBConnectionFactory {
	public static JDBCConnectionPool createJDBCConnection(){
		return new JDBCConnectionPool();
	}
	public static OtherDiverConnection createOtherDiverConnection(){
		return new OtherDiverConnection();
	}
}
