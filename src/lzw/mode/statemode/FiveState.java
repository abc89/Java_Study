package lzw.mode.statemode;

public class FiveState extends State {

	public void showCurState(Work w) {
		if(w.getHour()<22){
			System.out.println(w.getWorkerName()+"不可以再加班啦");
		}
		else{
			System.out.println(w.getWorkerName()+"太累睡着了？");
		}
	}

}
