package lzw.mode.prototypemode;

public class Main {

	public Main(){
		//shallowCopying();//ǳ����
	//	deepCopy();//���������
		normalDeepCopy();//�������
	}
	/***
	 * @author zjb
	 * �Դ����  ��Resume��Ӧ�õ���������ı��� Ҳʵ��Cloneable�ӿ�,����
	 */
//	private void deepCopy() {
//		Resume resume1=new Resume("С��");
//		resume1.setResume("��", 21);
//		resume1.setWorkExperience("15-2-2", "assas��ҵ");
//		
//		
//		Resume resume2=(Resume) resume1.clone();
//		resume2.setResume("name", 12);
//		resume2.setWorkExperience("asd", "as");
//		resume1.disPlay();
//		resume2.disPlay();
//		if(resume1!=resume2){
//			System.out.println("ǳ����   resume1 ��resume2�����");
//		}
//		if(resume1.workExperience!=resume2.workExperience){
//			System.out.println("ǳ����    resume1.workExperience ��resume2.workExperience �����");
//		}
//	}
	public static void main(String[] args){
		new Main();
	}
//
	//ֻ�ǽ�Resumeʵ��Colneable�ӿ�
//	private  void shallowCopying() {
//		Resume resume1=new Resume("С��");
//		resume1.setResume("��", 21);
//		resume1.setWorkExperience("15-2-2", "assas��ҵ");
//		
//		
//		Resume resume2=(Resume) resume1.clone();
//		resume2.setResume("name", 12);
//		resume2.setWorkExperience("asd", "as");
//		resume1.disPlay();
//		resume2.disPlay();
//		if(resume1!=resume2){
//			System.out.println("resume1 ��resume2�����");
//		}
//		if(resume1.workExperience==resume2.workExperience){
//			System.out.println("resume1.workExperience ��resume2.workExperience ���");
//		}
//	}

	/**
	 * ��׼���
	 */
	private void normalDeepCopy() {
		Resume resume1=new Resume("С��");
		resume1.setResume("��", 21);
		resume1.setWorkExperience("15-2-2", "assas��ҵ");
		
		
		Resume resume2=(Resume) resume1.deepClone();
		resume2.setResume("name", 12);
		resume2.setWorkExperience("asd", "   dddas��ҵ");
		resume1.disPlay();
		resume2.disPlay();
		if(resume1!=resume2){
			System.out.println("resume1 ��resume2�����");
		}
		if(resume1.workExperience!=resume2.workExperience){
			System.out.println("resume1.workExperience ��resume2.workExperience �����");
		}
	}

}
