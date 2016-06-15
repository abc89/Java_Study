package lzw.mode.simplefactorymode;

public class OperationDiv extends Operation {
	public double getResult(double dividend,double divisor) {
		double result=0;
		if(divisor==0){
			try {
				throw new Exception("除数不能为零");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
			result=dividend/divisor;
		
		return result;
		
	}
}
