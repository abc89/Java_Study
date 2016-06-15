package lzw.mode.mediatorodetest;

public class Main {

	public static void main(String[] args) {

		UniteNationsSesurityCouncil sesurityCouncil=new UniteNationsSesurityCouncil();
		
		Iraq iraq=new Iraq(sesurityCouncil);
		USA usa=new USA(sesurityCouncil);
		
		sesurityCouncil.setIraq(iraq);
		sesurityCouncil.setUSA(usa);
		
		usa.send("×·ÇóºÍÆ½");
		
	}

}
