package lzw.mode.intepretermodetext;

public abstract  class Expression {

	public void intepreter(PlayContext context){
		if(context.playText.length()<0){
			return;
		}
		String playKey=context.playText.substring(0, 1);
		context.playText=context.playText.substring(context.playText.indexOf(" ")+1);
		//�ַ�������"2.5 "ʱ����֤ȡ��"2.5"
		double playValue=Double.parseDouble(context.playText.substring(0,context.playText.indexOf(" ")));
		
		
		context.playText=context.playText.substring(context.playText.indexOf(" ")+1);//��ȥһ�Լ�ֵ
		
		
		excute(playKey,playValue);
	}

	abstract void excute(String playKey, double playValue);
}
