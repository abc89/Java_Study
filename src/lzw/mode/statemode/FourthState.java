package lzw.mode.statemode;

public class FourthState extends State {

	public void showCurState(Work w) {
		if(w.getHour()<21){
			System.out.println(w.getWorkerName()+"人物未完成，加班中");
		}
		else{
			new FiveState().showCurState(w);
		}
	}

}
