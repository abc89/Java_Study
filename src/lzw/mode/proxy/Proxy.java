package lzw.mode.proxy;

public class Proxy implements GiveGift{

   Giveor giveor;
	public Proxy(Siciver siciver){
		giveor=new Giveor(siciver);
	}
	public void giveA() {
		giveor.giveA();
	}


	public void giveB() {
		giveor.giveB();
	}


	public void giveC() {
		giveor.giveC();
	}

	
}
