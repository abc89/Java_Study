package lzw.mode.visitormodetest;

//具体的一种访问状态
public class FailAction extends Action {



	
	public void showManAction(Man man) {
		System.out.println("男人失败时 闷头喝酒 谁也不用劝");
	}

	
	public void showWonmenAction(Woman concreteElement2) {
		System.out.println("女人失败时 眼泪汪汪  谁也劝不了");
	}

}
