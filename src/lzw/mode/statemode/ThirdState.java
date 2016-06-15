package lzw.mode.statemode;

public class ThirdState extends State {

	
	public void showCurState(Work w) {
		if(w.getHour()<17){
			System.out.println(w.getWorkerName()+"工作任务完成，自由下班");
		}
		else{
			new FourthState().showCurState(w);
		}
	}

}
