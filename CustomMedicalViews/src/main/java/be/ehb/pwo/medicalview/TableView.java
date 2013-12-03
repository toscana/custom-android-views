package be.ehb.pwo.medicalview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class TableView extends TableLayout implements TableModelListener {
	
	private TableModel model;
	private TableViewLayout layout;

	public TableView(Context context,TableModel model) {
		super(context);
		// TODO Auto-generated constructor stub
		this.model = model;
		initialize();
	}

	public TableView(Context context, AttributeSet attrs,TableModel model) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		this.model = model;
		initialize();
	}
	
	public void setLayout(TableViewLayout layout){
		this.layout = layout;
		updateLayout();
	}
	
	public void updateLayout(){
		
		int nbRows = model.getRowCount();
		int nbCols = model.getColumnCount();

		
		//+1 because we also want to layout the header
		for(int i=0;i<nbRows+1;i++){
			
			TableRow tr = (TableRow) getChildAt(i);
					
			for(int j=0;j<nbCols;j++){
					
				TextView t = (TextView) tr.getChildAt(j);
				//Log.d("bert","waarde is " + i + "," + j);
				
				CellLayout cl = layout.getLayoutForCell(i,j);
				if(cl != null)
					cl.applyToElement(t);
				
			}
		}
			
		this.requestLayout();
		this.invalidate();
	}

	private void initialize() {
		int nbRows = model.getRowCount();
		int nbCols = model.getColumnCount();

		TableRow header = new TableRow(this.getContext());
		this.addView(header,0);
		
		for(int j = 0;j<nbCols;j++){
			TextView t = new TextView(this.getContext());
			t.setText(model.getColumnName(j));
			t.setPadding(10, 4, 10, 4);
			header.addView(t);
			
		}
		
		for(int i=0;i<nbRows;i++){
			
			TableRow tr = new TableRow(this.getContext());
			this.addView(tr,i+1);
			
			for(int j=0;j<nbCols;j++){
					
				TextView t = new TextView(this.getContext());
				Log.d("bert","waarde is " + i + "," + j);
				t.setText(model.getValueAt(i,j).toString());
				tr.addView(t);
				t.setPadding(10, 4, 10, 4);
			}
		}
			
		Log.d("bert","row size is " + nbRows);
		Log.d("bert","column size is " + nbCols);
		
			
		//from 1 to nbRows+1 because header row doesn't count
		
		
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
	}


}
