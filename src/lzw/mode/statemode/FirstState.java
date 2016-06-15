package lzw.mode.statemode;

public class FirstState extends State {


	public void showCurState(Work w) {
		if(w.getHour()<12){
			System.out.println(w.getWorkerName()+"精神抖擞工作时间");
		}
		else{
			new SecondState().showCurState(w);
		}
	}

}
