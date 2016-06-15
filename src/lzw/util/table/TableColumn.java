package lzw.util.table;

/**
 * ����
 * @author e7691
 *
 * @param <K>
 * @param <V>
 */
public class TableColumn<K,V> {
    private TableItem<K, V> tableItem;//����ʵ���������߹��캯����ʵ����
    
    public static int maxCount;//������Ŀ
    public static boolean hasMaxCount=false;
    public int length=0;
    public TableColumn(){
    	//item=new TableItem<k,v>();
    	
    }
    /*****************************************��ӹ���**************************************/
    //��ӱ�ļ���ֵ��
    public void add(K key,V value){
    	if(!hasMaxCount){
    	TableItem<K, V> curItem=tableItem;
    	//��ͷ��null����ʼ�����һ��
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
    	    	//��ͷ��null����ʼ�����һ��
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
    			System.out.println("lzw.util.tablecolum"+"add()���� �Ѿ�Ϊ��������Ŀ��Ӧ��ֵ�����������");
    		}
    	}
    }
    
    /****************************************���ҹ���************************************/
    //��������������Ӧ:��
    public   K getKeyByIndex(int index){
    	TableItem<K, V> curItem=tableItem;
    	boolean flag=false;
    	K key=null;
    	while(!flag&&curItem!=null){
    		if(curItem.index!=index){
    		curItem=curItem.nextItem;
    		}else{
    			key=curItem.key;
    			flag=true;//�ҵ����˳�
    		}
    	}
    	return key;
    }
    
  //��������������Ӧ:ֵ
    public   V getValueByIndex(int index){
    	TableItem<K, V> curItem=tableItem;
    	boolean flag=false;
    	V value=null;
    	while(!flag&&curItem!=null){
    		if(curItem.index!=index){
    		curItem=curItem.nextItem;
    		}else{
    			value=curItem.value;
    			flag=true;//�ҵ����˳�
    		}
    	}
    	return value;
    }
    
    //���ݼ�����ֵ
    public   V getValueByKey(K key){
    	TableItem<K, V> curItem=tableItem;
    	boolean flag=false;
    	V value=null;
    	while(!flag&&curItem!=null){
    		if(curItem.key!=key){
    		curItem=curItem.nextItem;
    		}else{
    			value=curItem.value;
    			flag=true;//�ҵ����˳�
    		}
    	}
    	return value;
    }
    /***************************************�޸Ĺ���*********************************/
    //���ݼ��޸���Ӧֵ
    public  void setValueByKey(K key,V value){
    	TableItem<K, V> curItem=tableItem;
    	boolean flag=false;
    	
    	while(!flag&&curItem!=null){
    		if(curItem.key!=key){
    		curItem=curItem.nextItem;
    		}else{
    			curItem.value=value;
    			flag=true;//�ҵ����˳�
    		}
    	}
    
    }
    
  //���������޸���Ӧֵ
    public  void setValueByIndex(int index,V value){
    	TableItem<K, V> curItem=tableItem;
    	boolean flag=false;
    	
    	while(!flag&&curItem!=null){
    		if(curItem.index!=index){
    		curItem=curItem.nextItem;
    		}else{
    			curItem.value=value;
    			flag=true;//�ҵ����˳�
    		}
    	}
    
    }
    //���
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
     * ���е�һ�����ֵ
     */
    class TableItem<K,V>{
    	private K key;
    	private V value;
    	private int index;
    	private TableItem<K, V> nextItem=null;
    }
    }
