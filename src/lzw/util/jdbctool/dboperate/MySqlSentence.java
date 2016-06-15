package lzw.util.jdbctool.dboperate;

/*
 * ע��ո�!!!!!!!!!!!!!!
 * ����ֱ��Ҫ�ӿո�
 * �˴�JDBC���� ���� ͳһ���ɼӵ����š�'���� �ɼӿɲ��ӷֺá�;��
 * 
 * ���� [id]�ӷ����Ŵ���
 */
public  class MySqlSentence {

	 //��ӣ��������,�����Զ��Ƿ��Զ�����
	public static String getInsert(boolean auto,String tableName,String[] keys,Object...params){
		String insertSentence=null;
		if(auto){
			System.out.println("��ֵ�Զ� ��һ");
		 insertSentence="insert into "+tableName+"(";
		//�������������� ֵ����ʱ����ֱ�Ӹ�ֵ�������������˵������
		for(int i=1;i<keys.length;i++){
			if(i!=(keys.length-1)){
				insertSentence=insertSentence+keys[i]+",";
			}else{
				insertSentence=insertSentence+keys[i]+")values('";
			}
		}
		for(int i=1;i<params.length;i++){
			if(i!=(params.length-1)){
			if(params[i] instanceof String||params[i] instanceof Integer){
				insertSentence=insertSentence+params[i]+"','";
			}else{
				insertSentence=insertSentence+null+"','";
			}
			}else if(params[i] instanceof String||params[i] instanceof Integer){
				insertSentence=insertSentence+params[i]+"')";
			}
		}}else{
			System.out.println("��ֵ���Զ� ��һ");
			insertSentence="insert into "+tableName+" values('";
			for(int i=0;i<params.length;i++){
				if(i!=(params.length-1)){
				if(params[i] instanceof String||params[i] instanceof Integer){
					insertSentence=insertSentence+params[i]+"','";
				}else{
					insertSentence=insertSentence+null+"','";
				}
				}else if(params[i] instanceof String||params[i] instanceof Integer){
					insertSentence=insertSentence+params[i]+"')";
				}
			}
		}
		
		System.out.println(insertSentence);
		return insertSentence;

	}
	//��ѯ���ű����
	public static String getQuery(String tableName){
		if(tableName!=null){
		return "select * from "+tableName;
		}
		return tableName;
	}
	//��ѯ���
	public static String getSearch(String tableName,String key,String value){
		if(tableName!=null){
		return "select * from "+tableName+" where "+key+"='"+value+"'";
	}
	return null;
	}
	//��ձ����
	public static String getClearAll(String tableName){
		return "delete from "+tableName;
		
	}
	//������
			public static String getCreateTable(String tableName){
				return "CREATE TABLE "+tableName;
				
			}
			//ɾ��ĳһ��
			public static String getDeleteTable(String tableName,String key,Object value){
				return "DELETE FROM "+tableName+" WHERE "+key+"='"+value+"'";
				
			}
	//ɾ����
		public static String getDropTable(String tableName){
			return "drop table "+tableName;
			
		}
		//������������
		public static String getUpdateTable(String tableName,String whereKey,String keyvalue,String upKey,String upValue){
			return "update "+tableName+" set "+upKey+"="+upValue+" where "+whereKey+"='"+upKey+"'";
		}
		//���и���
		public static String getUpdateTable(String tableName,String[] keys,Object...params){
			String updateSentence=null;
			String key=keys[0];
		    String keyValue=params[0].toString();
			updateSentence="update "+tableName+" set";
				//�������������� ֵ����ʱ����ֱ�Ӹ�ֵ�������������˵������
				for(int i=1;i<keys.length;i++){
					updateSentence=updateSentence+" "+keys[i]+"='";
					if(i!=(keys.length-1)){
					if(params[i] instanceof String||params[i] instanceof Integer){
						updateSentence=updateSentence+params[i]+"',";
					}else{
						updateSentence=updateSentence+null+"',";
					}
					
				}else{
					if(params[i] instanceof String||params[i] instanceof Integer){
						updateSentence=updateSentence+params[i]+"' where "+key+"='"+keyValue+"'";
					}else{
						updateSentence=updateSentence+null+"' where "+key+"='"+keyValue+"'";
					}
				}
		}
			
			return updateSentence;
		}
}
