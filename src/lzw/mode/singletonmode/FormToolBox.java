package lzw.mode.singletonmode;

public class FormToolBox {

	private static FormToolBox formToolBox=null;
	private static Object object=new Object();//��ס�����������̶߳�����
	private static Thread td=new Thread();//Ҳ����ס�����������̶߳�����
	private static Integer integer=new Integer(0);
	private static int count=0;
	private FormToolBox(){
		
	}
	//˫���ж��Ƿ�Ϊnull�����߳�������֤����һ��ʵ��
	public static FormToolBox getInstance(){
		if(formToolBox==null){
		synchronized (integer) {
			if(formToolBox==null){
				count++;
				System.out.println(Thread.currentThread().getName()+"������"+count+"ʵ��");
				formToolBox=new FormToolBox();
			}
			
		}
		}
		return formToolBox;
	}
	//δ���߳��������̵߳���ʱ���ɱ�֤����
	public static FormToolBox getInstance2(){
		
			if(formToolBox==null){
				count++;
				System.out.println(Thread.currentThread().getName()+"������"+count+"ʵ��");
				formToolBox=new FormToolBox();
			}
		return formToolBox;
	}
	
	//��formToolBox==null,һ���̱߳���ס�������߳̿�����if(formToolBox==null){  ��  synchronized (integer)֮���Ŷӣ�������ͬ��������ʵ��
	//��getInstance2()���
	//getInstance2()�����count��һ�����磺3,3,3,3,3
	//getInstance3()�������count Ϊ��1��2��3��4��5��6
	public static FormToolBox getInstance3(){
		if(formToolBox==null){
		synchronized (integer) {
			
				count++;
				System.out.println(Thread.currentThread().getName()+"������"+count+"ʵ��");
				formToolBox=new FormToolBox();
			
			
		}
		}
		return formToolBox;
	}
}
