package lzw.mode.statemode;

public class SecondState extends State {

	
	public void showCurState(Work w) {
		if(w.getHour()<13){
			System.out.println(w.getWorkerName()+"×¢ÒâÎçÐÝ³Ô·¹À²");
		}
		else{
			new ThirdState().showCurState(w);
		}
	}

}
