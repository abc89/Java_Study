package lzw.util.databasefactory;

public class AbstractFactoryMian {

	public static void main(String[] args){
		UserOperate operate=DatabaseFactory.createUserOperate();
		operate.add(new User());
		OtherOperate operate2=DatabaseFactory.createOtherOperate();
		operate2.add(new Other());
	}
}
