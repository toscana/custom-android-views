package be.ehb.pwo.medicalview;

public class TableViewLayout{
	private CellLayout[][] cellLayouts;
	
	public TableViewLayout(int rows,int cols){
		cellLayouts = new CellLayout[rows][cols];
	}
	
	
	public CellLayout getLayoutForCell(int row,int col){
		if(row > cellLayouts.length || row < 0)
			throw new IllegalArgumentException("Row number too high or lower than 0");
		else if(col > cellLayouts[row].length || col < 0)
			throw new IllegalArgumentException("Column number too high or lower than 0");
		return cellLayouts[row][col];
	}
	
	/*
	 * Puts the given layout on a specific cell
	 */
	public void setLayoutForCell(int row,int col,CellLayout layout){
		if(row > cellLayouts.length || row <0)
			throw new IllegalArgumentException("Row number too high or lower than 0");
		else if(col > cellLayouts[row].length || col <0)
			throw new IllegalArgumentException("Column number too high or lower than 0");
		cellLayouts[row][col] = layout;
	}
	
	
	/*
	 * Puts the given layout on all cells in the given row numbers
	 */
	public void setLayoutForRows(int[] rows,CellLayout layout){
		for(int i=0;i<rows.length;i++)
			if(rows[i] > cellLayouts.length || rows[i]<0)
				throw new IllegalArgumentException("One of the given row numbers too high or lower than 0");
		
		for(int i=0;i<rows.length;i++){
			int rownb = rows[i];
			for(int j=0;j<cellLayouts[i].length;j++)
				cellLayouts[rownb][j] = layout;
		}
	}
	
	/*
	 * Puts the given layout on all the cells of this row
	 */
	public void setLayoutForRow(int row,CellLayout layout){
		if(row > cellLayouts.length)
			throw new IllegalArgumentException("Row number too high");
		for(int j=0;j<cellLayouts[row].length;j++)
			cellLayouts[row][j] = layout;
	}
	
	/*
	 * Puts the given layout on all cells starting from rowStart to (including)
	 * rowStop and from colStart to (including) colStop 
	 */
	public void setLayoutForSelection(int rowStart,int rowStop,int colStart,int colStop,CellLayout layout){
		if(rowStart >= cellLayouts.length || rowStart < 0)
			throw new IllegalArgumentException("Row start number too high or lower than 0");
		else if(rowStop >= cellLayouts.length || rowStop < 0)
			throw new IllegalArgumentException("Row stop number too high or lower than 0");
		else if(colStart >= cellLayouts.length || colStart < 0)
			throw new IllegalArgumentException("Col start number too high or lower than 0");
		else if(colStop >= cellLayouts.length || colStop < 0)
			throw new IllegalArgumentException("Col start number too high or lower than 0");
		else if(rowStart > rowStop)
			throw new IllegalArgumentException("Row start should be lower than or equal to row stop");
		else if(colStart > colStop)
			throw new IllegalArgumentException("Col start should be lower than or equal to col stop");
		
		
		for(int i=rowStart;i<= rowStop;i++)
			for(int j=colStart;j<=colStop;j++)
				cellLayouts[i][j] = layout;
		
	}
	
	/*
	 * Puts the given layout on all cells starting from rowStart to (including)
	 * rowStop and from colStart to (including) colStop 
	 */
	public void setAlternatingLayoutForSelection(int rowStart,int rowStop,int colStart,int colStop,CellLayout odd,CellLayout even ){
		if(rowStart >= cellLayouts.length || rowStart < 0)
			throw new IllegalArgumentException("Row start number too high or lower than 0");
		else if(rowStop >= cellLayouts.length|| rowStop < 0)
			throw new IllegalArgumentException("Row stop number too high or lower than 0");
		else if(colStart >= cellLayouts.length || colStart < 0)
			throw new IllegalArgumentException("Col start number too high or lower than 0");
		else if(colStop >= cellLayouts.length || colStop < 0)
			throw new IllegalArgumentException("Col start number too high or lower than 0");
		else if(rowStart > rowStop)
			throw new IllegalArgumentException("Row start should be lower than or equal to row stop");
		else if(colStart > colStop)
			throw new IllegalArgumentException("Col start should be lower than or equal to col stop");
		
		
		for(int i=rowStart;i<= rowStop;i++)
			for(int j=colStart;j<=colStop;j++)
				if(i%2 == 0)
					cellLayouts[i][j] = even;
				else
					cellLayouts[i][j] = odd;
		
	}
	

}
