package lzw.mode.statemode;

public class ThirdState extends State {

	
	public void showCurState(Work w) {
		if(w.getHour()<17){
			System.out.println(w.getWorkerName()+"����������ɣ������°�");
		}
		else{
			new FourthState().showCurState(w);
		}
	}

}
