package lzw.mode.statemode;

public class FirstState extends State {


	public void showCurState(Work w) {
		if(w.getHour()<12){
			System.out.println(w.getWorkerName()+"�����ӹ���ʱ��");
		}
		else{
			new SecondState().showCurState(w);
		}
	}

}
