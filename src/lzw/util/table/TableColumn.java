package lzw.util.table;

/**
 * 表项
 * @author e7691
 *
 * @param <K>
 * @param <V>
 */
public class TableColumn<K,V> {
    private TableItem<K, V> tableItem;//这里实例化，或者构造函数中实例化
    
    public static int maxCount;//表象数目
    public static boolean hasMaxCount=false;
    public int length=0;
    public TableColumn(){
    	//item=new TableItem<k,v>();
    	
    }
    /*****************************************添加功能**************************************/
    //添加表的键，值对
    public void add(K key,V value){
    	if(!hasMaxCount){
    	TableItem<K, V> curItem=tableItem;
    	//表头项null，初始化表第一项
    	if(tableItem==null){
    		tableItem=new TableItem<K,V>();
    		tableItem.index=0;
    		tableItem.key=key;
    		tableItem.value=value;
    		length++;
    		return;
    	}
    	while(curItem.nextItem!=null){
    		curItem=curItem.nextItem;
    	}
    	curItem.nextItem=new TableItem<K,V>();
    	curItem.nextItem.key=key;
    	curItem.nextItem.value=value;
    	curItem.nextItem.index=curItem.index+1;
    	length++;
    	}else{
    		if(length<maxCount){
    			TableItem<K, V> curItem=tableItem;
    	    	//表头项null，初始化表第一项
    	    	if(tableItem==null){
    	    		tableItem=new TableItem<K,V>();
    	    		tableItem.index=0;
    	    		tableItem.key=key;
    	    		tableItem.value=value;
    	    		length++;
    	    		return;
    	    	}
    	    	while(curItem.nextItem!=null){
    	    		curItem=curItem.nextItem;
    	    	}
    	    	curItem.nextItem=new TableItem<K,V>();
    	    	curItem.nextItem.key=key;
    	    	curItem.nextItem.value=value;
    	    	curItem.nextItem.index=curItem.index+1;
    	    	length++;
    		}else{
    			System.out.println("lzw.util.tablecolum"+"add()方法 已经为最大表项数目对应的值，不可再添加");
    		}
    	}
    }
    
    /****************************************查找功能************************************/
    //根据索引查找相应:键
    public   K getKeyByIndex(int index){
    	TableItem<K, V> curItem=tableItem;
    	boolean flag=false;
    	K key=null;
    	while(!flag&&curItem!=null){
    		if(curItem.index!=index){
    		curItem=curItem.nextItem;
    		}else{
    			key=curItem.key;
    			flag=true;//找到则退出
    		}
    	}
    	return key;
    }
    
  //根据索引查找相应:值
    public   V getValueByIndex(int index){
    	TableItem<K, V> curItem=tableItem;
    	boolean flag=false;
    	V value=null;
    	while(!flag&&curItem!=null){
    		if(curItem.index!=index){
    		curItem=curItem.nextItem;
    		}else{
    			value=curItem.value;
    			flag=true;//找到则退出
    		}
    	}
    	return value;
    }
    
    //根据键查找值
    public   V getValueByKey(K key){
    	TableItem<K, V> curItem=tableItem;
    	boolean flag=false;
    	V value=null;
    	while(!flag&&curItem!=null){
    		if(curItem.key!=key){
    		curItem=curItem.nextItem;
    		}else{
    			value=curItem.value;
    			flag=true;//找到则退出
    		}
    	}
    	return value;
    }
    /***************************************修改功能*********************************/
    //根据键修改相应值
    public  void setValueByKey(K key,V value){
    	TableItem<K, V> curItem=tableItem;
    	boolean flag=false;
    	
    	while(!flag&&curItem!=null){
    		if(curItem.key!=key){
    		curItem=curItem.nextItem;
    		}else{
    			curItem.value=value;
    			flag=true;//找到则退出
    		}
    	}
    
    }
    
  //根据索引修改相应值
    public  void setValueByIndex(int index,V value){
    	TableItem<K, V> curItem=tableItem;
    	boolean flag=false;
    	
    	while(!flag&&curItem!=null){
    		if(curItem.index!=index){
    		curItem=curItem.nextItem;
    		}else{
    			curItem.value=value;
    			flag=true;//找到则退出
    		}
    	}
    
    }
    //清空
    public void clear(){
    	TableItem<K, V> curItem=tableItem;
    	TableItem<K, V> tempItem=null;
    	while(curItem!=null){
    		tempItem=curItem;
    		curItem=curItem.nextItem;
    		tempItem.nextItem=null;
    	}
    	tableItem=null;
    	length=0;
    }
    
    
    
//    public static void main(String[] args){
//       Table<String, Integer>  table=new Table<String,Integer>();
//       table.add("id", 123);
//       table.add("id", 12);
//       System.out.println(table.getValueByIndex(2));
//       System.out.println(table.getValueByKey("id"));
//       System.out.println(table.getKeyByIndex(2));
//    }
    
    /*
     * 表中的一项，键与值
     */
    class TableItem<K,V>{
    	private K key;
    	private V value;
    	private int index;
    	private TableItem<K, V> nextItem=null;
    }
    }
