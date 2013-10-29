package com.example.custommedicalviews;

import java.util.List;

public interface TableModel {

	
	public void addTableModelListener(TableModelListener l);
	public Class<?> getColumnClass(int columnIndex);
	public int getColumnCount();
	public String getColumnName(int columnIndex);
	public int getRowCount();
	public Object getValueAt(int rowIndex,int columnIndex);
	public boolean isCellEditable(int rowIndex,int columnIndex);
	public void removeTableModelListener(TableModelListener l);
	public void setValueAt(Object aValue,int rowIndex,int columnIndex);

}
