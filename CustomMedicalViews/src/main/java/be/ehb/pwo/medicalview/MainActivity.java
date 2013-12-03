package be.ehb.pwo.medicalview;



import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		List<Object> columns = new ArrayList<Object>();
		List<List<Object>> data = new ArrayList<List<Object>>();
		
		
		columns.add(new String("Test"));
		columns.add(new String("Unit"));
		columns.add(new String("Reference interval"));
		columns.add(new String("01/12/2012"));
		columns.add(new String("25/01/2013"));
		
		
		List<Object> first = new ArrayList<Object>();
		first.add("Sodium(Na)");
		first.add("mmol/L");
		first.add("136-145");
		first.add("138");
		first.add("148");
		data.add(first);
		
		List<Object> second = new ArrayList<Object>();
		second.add("Potassium(K)");
		second.add("mmol/L");
		second.add("3.5-5.0");
		second.add("3");
		second.add("3.2");
		data.add(second);
		
		List<Object> thrid = new ArrayList<Object>();
		thrid.add("Creatinine - male");
		thrid.add("µmol/L");
		thrid.add("53-97");
		thrid.add("60");
		thrid.add("65");
		data.add(thrid);
		
		thrid = new ArrayList<Object>();
		thrid.add("Creatinine - female");
		thrid.add("mg/dL");
		thrid.add("53-97");
		thrid.add("110");
		thrid.add("115");
		data.add(thrid);
		
		thrid = new ArrayList<Object>();
		thrid.add("Phosphorus");
		thrid.add("mg/dL");
		thrid.add("2.4-4.1");
		thrid.add("2.6");
		thrid.add("3.1");
		data.add(thrid);
		
		
		thrid = new ArrayList<Object>();
		thrid.add("Triglycerides");
		
		thrid.add("mg/dL");
		thrid.add("40-160");
		thrid.add("35");
		thrid.add("45");
		data.add(thrid);
		
		
			
		TableModel model = new DefaultTableModel(data,columns);
		
		TableViewLayout l = new TableViewLayout(model.getRowCount()+1,model.getColumnCount());
		
		CellLayout cl = new CellLayout();
		cl.setTypeface(Typeface.DEFAULT_BOLD);
		cl.setBackground(0x25000000);
		l.setLayoutForRow(0,cl);
		
		
		CellLayout even = new CellLayout();
		even.setBackground(0xFFFFFF00);
		
		CellLayout odd = new CellLayout();
		odd.setBackground(0x11FFFF00);
		
		l.setAlternatingLayoutForSelection(1, 6, 0, 4, odd, even);
		
		
		
		
		Log.d("bert","size of model rows is " + model.getRowCount());
		//Log.d("bert","size of model rows is " + model.get);
		
		
		TableView t = new TableView(this,model);
		t.setLayout(l);
	
		
		LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		t.setLayoutParams(lp);
		
		
		
		Button b = new Button(this);
		b.setText("press me");
		setContentView(t);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
