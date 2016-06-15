package lzw.mode.visitormodetest;

//另一种具体访问状态
public class SuccessAction extends Action {

	public void showManAction(Man man) {
		System.out.println("男人成功时 是因为他背后有一个伟大的女人");
	}

	
	public void showWonmenAction(Woman concreteElement2) {
		System.out.println("女人成功时 是因为她背后有一个不成功的男人");
	}

}
