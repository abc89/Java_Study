package lzw.mode.statemode;

public class FourthState extends State {

	public void showCurState(Work w) {
		if(w.getHour()<21){
			System.out.println(w.getWorkerName()+"����δ��ɣ��Ӱ���");
		}
		else{
			new FiveState().showCurState(w);
		}
	}

}
