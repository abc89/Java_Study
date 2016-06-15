package lzw.mode.prototypemode;

import java.io.Serializable;

public class WorkExperience implements Cloneable,Serializable{

	/***
	 * @author zjb
	 * �Դ����  ��Resume��Ӧ�õ���������ı��� Ҳʵ��Cloneable�ӿ�,����
	 */
	protected Object clone() throws CloneNotSupportedException {
		 WorkExperience experience=null;
		try {
			experience=(WorkExperience)super.clone();
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return experience;
	}
	private String workDate;
	private String workCompany;
	public void setWorkExperience(String workDate,String workCompany){
		this.workCompany=workCompany;
		this.workDate=workDate;
	}
	public void disPaly(){
		System.out.println(workDate+workCompany);
	}
}
