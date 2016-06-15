package lzw.mode.prototypemode;

public class Main {

	public Main(){
		//shallowCopying();//浅复制
	//	deepCopy();//非正常深复制
		normalDeepCopy();//正常深复制
	}
	/***
	 * @author zjb
	 * 自创深复制  将Resume中应用到的其他类的变量 也实现Cloneable接口,复制
	 */
//	private void deepCopy() {
//		Resume resume1=new Resume("小明");
//		resume1.setResume("男", 21);
//		resume1.setWorkExperience("15-2-2", "assas企业");
//		
//		
//		Resume resume2=(Resume) resume1.clone();
//		resume2.setResume("name", 12);
//		resume2.setWorkExperience("asd", "as");
//		resume1.disPlay();
//		resume2.disPlay();
//		if(resume1!=resume2){
//			System.out.println("浅复制   resume1 与resume2不相等");
//		}
//		if(resume1.workExperience!=resume2.workExperience){
//			System.out.println("浅复制    resume1.workExperience 与resume2.workExperience 不相等");
//		}
//	}
	public static void main(String[] args){
		new Main();
	}
//
	//只是将Resume实现Colneable接口
//	private  void shallowCopying() {
//		Resume resume1=new Resume("小明");
//		resume1.setResume("男", 21);
//		resume1.setWorkExperience("15-2-2", "assas企业");
//		
//		
//		Resume resume2=(Resume) resume1.clone();
//		resume2.setResume("name", 12);
//		resume2.setWorkExperience("asd", "as");
//		resume1.disPlay();
//		resume2.disPlay();
//		if(resume1!=resume2){
//			System.out.println("resume1 与resume2不相等");
//		}
//		if(resume1.workExperience==resume2.workExperience){
//			System.out.println("resume1.workExperience 与resume2.workExperience 相等");
//		}
//	}

	/**
	 * 标准深复制
	 */
	private void normalDeepCopy() {
		Resume resume1=new Resume("小明");
		resume1.setResume("男", 21);
		resume1.setWorkExperience("15-2-2", "assas企业");
		
		
		Resume resume2=(Resume) resume1.deepClone();
		resume2.setResume("name", 12);
		resume2.setWorkExperience("asd", "   dddas企业");
		resume1.disPlay();
		resume2.disPlay();
		if(resume1!=resume2){
			System.out.println("resume1 与resume2不相等");
		}
		if(resume1.workExperience!=resume2.workExperience){
			System.out.println("resume1.workExperience 与resume2.workExperience 不相等");
		}
	}

}
