package lzw.mode.mediatorodetest;

//联合国安理事会
public  class UniteNationsSesurityCouncil extends UniteNations{

	private Iraq iraq;
	private USA usa;
	public void setIraq(Iraq iraq){
		this.iraq=iraq;
	}
	public void setUSA(USA usa){
		this.usa=usa;
	}
	void send(String msg,Countrys countrys) {
		if(countrys==iraq){
        usa.notifyC(msg);
	}
		else	if(countrys==usa){
	        iraq.notifyC(msg);
		}
	}

}
