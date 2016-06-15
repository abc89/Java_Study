package lzw.mode.statemode;

public class Work {
    private FirstState firstState;
    private int hour;
    private String workerName;
    

    public Work(String workerName){
    	this.workerName=workerName;
    	this.firstState=new FirstState();
    }
    public void showCurrentState(){
    	firstState.showCurState(this);
    }
    
    public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
    
}
