package lzw.mode.composemode;

/*
 * 组合模式
 * 总公司与分公司
 * 公司与部门
 * 
 * 使用场景：
 * 体现部分与整体的层次结构
 * 当可忽略组合对象与单体对象的不同
 * 统一使用组合结构中所有对象
 * 
 */
public abstract class Company {
	//name 父类protected字段，子类可继承，故隐式可调用
	protected String name;
  public Company(String name){
	  this.name=name;
  }
  public abstract void add(Company company);
  public abstract void remove();
  public abstract void show(int depth);
  public abstract void performDuty();
  
}
