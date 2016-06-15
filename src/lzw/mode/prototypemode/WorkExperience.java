package lzw.mode.prototypemode;

import java.io.Serializable;

public class WorkExperience implements Cloneable,Serializable{

	/***
	 * @author zjb
	 * 自创深复制  将Resume中应用到的其他类的变量 也实现Cloneable接口,复制
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
