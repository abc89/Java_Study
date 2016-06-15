package lzw.polymorphic;

public class Main {

	public static void main(String[] args) {

		SubClass subClass=new SubClass("¸¸ÀàË½ÓÐ×Ö¶Î");
		subClass.showPrivateField();
		
		Genitor genitor=(SubClass)subClass;
		genitor.showSubClassPrivateField();
	}

}
