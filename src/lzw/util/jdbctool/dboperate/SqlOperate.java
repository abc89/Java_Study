package lzw.util.jdbctool.dboperate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import lzw.util.table.*;

public class SqlOperate extends DBOperate {

	@Override
	public void configureConnection() {
	}

	@Override
	public int configureTable(String tableName) {
		
		return 0;
	}

	@Override
	public void insertOne(TableColumn colum) {
	}

	@Override
	public TableColumn searchFirst(String key, String value) {
		
		return null;
	}

	@Override
	public void updateOne(TableColumn colum) {
	}

	@Override
	public void deleteOne(TableColumn colum) {
	}

	@Override
	public void insertBatch(Table table) {
	}

	@Override
	public Table searchBatch(String key, String value) {
		
		return null;
	}

	@Override
	public void updateBatch(Table table) {
	}

	@Override
	public void deleteBatch(Table table) {
	}

	@Override
	public void clearAll() {
	}

	@Override
	public void closeDB() {
	}

	@Override
	public
	Table query() {
		return null;
	}

	@Override
	public boolean executeUpdate(String sql, Object table) {
		
		return false;
	}

	@Override
	public
	void setParams(PreparedStatement preStmt, Object[] params) {
	}

	@Override
	public int getCount(String sql) throws SQLException {
		
		return 0;
	}


}
