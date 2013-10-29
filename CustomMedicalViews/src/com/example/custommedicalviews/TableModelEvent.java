package com.example.custommedicalviews;

import java.util.EventObject;

public class TableModelEvent extends EventObject{

	public static int ALL_COLUMNS;
	protected int column;
	
	static int DELETE = 1;
	static int INSERT = 2;
	static int UPDATE = 3;
	static int HEADER_ROW = -10;
	
	protected int firstRow;

	protected int lastRow;
	
	//type of the change: delete, insert or update
	protected int type;

	
	
	/*
	 * All row data in the table has changed, listeners should discard any
	 * state that was based on the rows and requery the TableModel to get
	 * the new row count and all the appropriate values.
	 */
	public TableModelEvent(TableModel source) {
		super(source);
	}
	
	/*
	 * This row of data has been updated
	 * 
	 * This row of data has been updated. To denote the arrival of a completely new table with a different structure
	 * use HEADER_ROW as the value for the row.
	 */
	public TableModelEvent(TableModel source,int row) {
		this(source);
		firstRow = row;
		lastRow = row;
	}
	
	/*
	 * The data in rows [firstRow,lastRow] have been updated
	 */
	public TableModelEvent(TableModel source,int firstRow,int lastRow) {
		this(source);
		this.firstRow = firstRow;
		this.lastRow = lastRow;
	}
	
	/*
	 * The cells in column column in the range [firstRow,lastRow] have been updated
	 */
	public TableModelEvent(TableModel source,int firstRow,int lastRow,int column) {
		this(source,firstRow,lastRow);
		this.column = column;
	}

	/*
	 * The cells from (firstRow, column) to (lastRow, column) have been changed. The column refers to the column index of the cell in the model's co-ordinate system. When column is ALL_COLUMNS, all cells in the specified range of rows are considered changed.
	 * The type should be one of: INSERT, UPDATE and DELETE.
	 */
	public TableModelEvent(TableModel source,int firstRow,int lastRow,int column,int type) {
		this(source,firstRow,lastRow,column);
		this.type = type;
		
	}	
	
	

	private static final long serialVersionUID = 115270548779468221L;

	

	
	

}
