package lze.englishstudy;

import java.awt.dnd.DnDConstants;

import lzw.util.jdbctool.dboperate.DBOperate;
import lzw.util.jdbctool.dboperate.DBOperateFactory;
import lzw.util.table.*;


/*
 * id主键[id]加方括号产生错误
 */
public class EnglishMainFrame {

	private EnglishWord word;
	private EnglishArticle article;
	DBOperate dbOperate=null;
	private Table tables;
	public EnglishMainFrame(){
		dbOperate=DBOperateFactory.createDBOperate();
		tables=new Table();
    initialWord();
		TableColumn<String, Object> colum=new TableColumn<String,Object>();
//		word=new EnglishWord();
//		word.setWordid(1);
//		word.setWord("successful21");
//		word.setWordsound("he:lo");
//		word.setWordmean("2112");
//		word.setWordexample("hellogogohellotony11");
//		colum.add(null,word.getWordid());
//		colum.add(null,word.getWord());
//		colum.add(null,word.getWordsound());
//		colum.add(null,word.getWordmean());
//		colum.add(null,word.getWordexample());
//		dbOperate.insert(colum);
//		//Table<String, Object> table1=new Table<String,Object>();
//		table.clear();
//		colum=dbOperate.searchFirst("word","successful21");
//		System.out.println("------------------------------------");
//		for(int i=0;i<colum.length;i++){
//			System.out.println(colum.getKeyByIndex(i)+" sdsfd "+colum.getValueByIndex(i));
//		}
//		System.out.println("------------------------------------");
//		System.out.println("------------------------------------");
//		colum.setValueByIndex(3,"成功的");
//		dbOperate.update(colum);
//		colum=dbOperate.searchFirst("wordid",colum.getValueByIndex(0).toString());
//		for(int i=0;i<colum.length;i++){
//			System.out.println(colum.getKeyByIndex(i)+" ------ "+colum.getValueByIndex(i));
//		}
//		System.out.println("------------------------------------");
//		System.out.println("------------------------------------");
		tables=dbOperate.searchBatch("wordmean","2112");
		for(int i=0;i<tables.length;i++){
			colum=tables.getTableColumByIndex(i);
			for(int j=0;j<colum.length;j++){
			System.out.println(colum.getKeyByIndex(j)+" ------ "+colum.getValueByIndex(j));
			}
		}
		System.out.println("deleteALLLLLLLl");
		for(int i=0;i<tables.length;i++){
			tables.getTableColumByIndex(i).setValueByIndex(3,"try2112批量修改");
			
		}
		dbOperate.updateBatch(tables);
		tables=dbOperate.searchBatch("wordmean","try2112批量修改");
		for(int i=0;i<tables.length;i++){
			colum=tables.getTableColumByIndex(i);
			for(int j=0;j<colum.length;j++){
			System.out.println(colum.getKeyByIndex(j)+" ------ "+colum.getValueByIndex(j));
			}
		}
		article();
	}
	//配置englishword表
private void initialWord() {
	
	//配置表,获得表项
	int i2=dbOperate.configureTable("englishword");
	tables.setTableCout(i2);
	}
		private void article() {
			initialEnglishArticle();
		//配置表
				tables.setTableCout(dbOperate.configureTable("englisharticle"));
				TableColumn<String, Object> colum=new TableColumn<String,Object>();
				article=new EnglishArticle();
				article.setId(3);
				article.setArticle("这是一遍文章");
				colum.add(null, article.getId());
				colum.add(null,article.getArticle());
				dbOperate.insertOne(colum);
				
				
				colum=dbOperate.searchFirst( "articleid","1");
				System.out.println("------------------------------------");
				for(int i=0;i<colum.length;i++){
					System.out.println(colum.getKeyByIndex(i)+" sdsfd "+colum.getValueByIndex(i));
				}
				System.out.println("------------------------------------");
				System.out.println("------------------------------------");
				colum.setValueByIndex(1,"成功的");
				dbOperate.updateOne(colum);
				colum=dbOperate.searchFirst("articleid",colum.getValueByIndex(0).toString());
				for(int i=0;i<colum.length;i++){
					System.out.println(colum.getKeyByIndex(i)+" ------ "+colum.getValueByIndex(i));
				}
		
	}
	private void initialEnglishArticle() {
		tables.setTableCout(dbOperate.configureTable("englisharticle"));
		}
	public static void main(String[] args){
		new EnglishMainFrame();
	}
}
