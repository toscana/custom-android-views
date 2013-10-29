package com.example.custommedicalviews;

import java.util.ArrayList;
import java.util.List;

public class DefaultTableModel extends AbstractTableModel {

	// the list of lists containing the data
	protected List<List<Object>> dataList;

	protected List<Object> columnIdentifiers;
	
	
	

	public DefaultTableModel(List<List<Object>> dataList, List<Object> columnIdentifiers) {
		super();
		this.dataList = dataList;
		this.columnIdentifiers = columnIdentifiers;
	}
	

	//create model with column names and with rowCount data rows which are empty
	public DefaultTableModel(List<Object> columnNames, int rowCount) {
		 dataList = new ArrayList<List<Object>>(); 
		 for(List<Object> list:dataList){
			 list = newList(rowCount);
		 }
		 this.columnIdentifiers = columnNames;
	}

	private List<Object> newList(int number){
		List<Object> list = new ArrayList<Object>(number);
		return list;
	}
	
	@Override
	public int getColumnCount() {
		return columnIdentifiers.size();
	}

	@Override
	public int getRowCount() {
		return dataList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return dataList.get(rowIndex).get(columnIndex);
	}
	
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		dataList.get(rowIndex).set(columnIndex, aValue);
	}
	
    public Class<?> getColumnClass(int columnIndex) {
        return columnIdentifiers.get(columnIndex).getClass();
    }

}
