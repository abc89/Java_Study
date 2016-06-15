package lzw.util.table;

import java.util.ArrayList;
import java.util.List;

public class Table {

	public int length;
	private int tableColumMaxCount;
	private int tableColumsLength=0;
	private List<TableColumn> tableColums=new ArrayList<>();
	public void setTableCout(int counts){
		TableColumn.maxCount=counts;
		TableColumn.hasMaxCount=true;
		this.tableColumMaxCount=counts;
	}
	public void add(TableColumn colum){
		tableColums.add(colum);
		length++;
	}
	public TableColumn getTableColumByIndex(int index){
		if(index<tableColums.size()){
			return tableColums.get(index);
		}
		return null;
	}
	public void clear(){
		tableColums.clear();
		length=0;
	}
	
}
