package lzw.mode.statemode;

public class FiveState extends State {

	public void showCurState(Work w) {
		if(w.getHour()<22){
			System.out.println(w.getWorkerName()+"�������ټӰ���");
		}
		else{
			System.out.println(w.getWorkerName()+"̫��˯���ˣ�");
		}
	}

}
