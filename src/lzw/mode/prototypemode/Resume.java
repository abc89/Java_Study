package lzw.mode.prototypemode;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Resume implements Cloneable, Serializable{

	
	/**
	 * ǳ����
	 * ���ƺ��worokExperience�Ķ�������ͬ��
	 */
	/*protected Object clone()  {
		
		try {
			return (Object)super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return null;
	}*/
	/***
	 * @author zjb
	 * �Դ����  ��Resume��Ӧ�õ���������ı��� Ҳʵ��Cloneable�ӿ�,����
	 */
	/*protected Object clone()  {
		Resume resume=null;
		try {
			resume=(Resume)super.clone();
		    resume.workExperience=(WorkExperience) workExperience.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return resume;
	}*/
	/*
	 * ��׼���
	 */
	protected Object deepClone()  {
		
		try {
			ByteArrayOutputStream bo=new ByteArrayOutputStream();
			ObjectOutputStream oo=new ObjectOutputStream(bo);
			oo.writeObject(this);//�����������
			ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
			ObjectInputStream oi=new ObjectInputStream(bi);
			return (oi.readObject());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
	private String name;
	public WorkExperience workExperience;
	private String sex;
	private int age;
	public Resume(String name){
		this.name=name;
		this.workExperience=new WorkExperience();
				}
	public void setResume(String sex,int age){
		this.sex=sex;
		this.age=age;
	}
	public void setWorkExperience(String workDate,String workCompany){
		workExperience.setWorkExperience(workDate, workCompany);
	}
	
	public void disPlay() {
		System.out.println(name+sex+age);
		workExperience.disPaly();
	}

}
