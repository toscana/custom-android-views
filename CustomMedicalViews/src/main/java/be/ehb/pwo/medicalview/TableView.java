package be.ehb.pwo.medicalview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class TableView extends LinearLayout implements TableModelListener {
	
	private List<LinearLayout> cols;
	private TableModel model;

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
	

	private void initialize() {
		// TODO Auto-generated method stub
		this.setOrientation(LinearLayout.HORIZONTAL);
		
		cols = new ArrayList<LinearLayout>();
		int nbRows = model.getRowCount();
		int nbCols = model.getColumnCount();
		
		
		
		for(int i=0;i<nbCols;i++){
			
			LinearLayout l = new LinearLayout(this.getContext());
			l.setOrientation(LinearLayout.VERTICAL);
			cols.add(l);
			this.addView(l);
			TextView headerView =new TextView(this.getContext());
			headerView.setPadding(50, 0, 50, 0);
			headerView.setText(model.getColumnName(i));
			LayoutParams p = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT,1);
			
			headerView.setLayoutParams(p);
			l.addView(headerView);
				
			
			for(int j=1;j<nbRows+1;j++){
					
				TextView t = new TextView(this.getContext());
				Log.d("bert","waarde is " + i + "," + j);
				t.setText(model.getValueAt(j-1,i).toString());
				l.addView(t);
				t.setPadding(50, 0, 50, 0);
			
				p = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT,1);
				
				t.setLayoutParams(p);
					
				
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
