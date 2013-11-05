package be.ehb.pwo.medicalview;



import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
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
		
		
		columns.add(new String("Voornaam"));
		columns.add(new String("Familienaam"));
		columns.add(new String("Straat"));
		columns.add(new String("Nummer"));
		columns.add(new String("Postcode"));
		
		
		
		List<Object> first = new ArrayList<Object>();
		first.add("Bert");
		first.add("Van Rillaer");
		first.add("Europalaan");
		first.add("Europalaan");
		first.add("Europalaan");
		data.add(first);
		
		List<Object> second = new ArrayList<Object>();
		second.add("Maria");
		second.add("Bosmans");
		second.add("Europalaan");
		second.add("Europalaan");
		second.add("Europalaan");
		data.add(second);
		
		List<Object> thrid = new ArrayList<Object>();
		thrid.add("Ria");
		thrid.add("Verrept");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		data.add(thrid);
		
		thrid = new ArrayList<Object>();
		thrid.add("Josiane");
		thrid.add("Leysen");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		data.add(thrid);
		
		thrid = new ArrayList<Object>();
		thrid.add("Josiane");
		thrid.add("Leysen");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		data.add(thrid);
		
		thrid = new ArrayList<Object>();
		thrid.add("Josiane");
		thrid.add("Leysen");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		data.add(thrid);
		
		thrid = new ArrayList<Object>();
		thrid.add("Josiane");
		
		thrid.add("Leysen");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		data.add(thrid);
		
		thrid = new ArrayList<Object>();
		thrid.add("Josiane");
		thrid.add("Leysen");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		data.add(thrid);
		
		thrid = new ArrayList<Object>();
		thrid.add("Josiane");
		thrid.add("Leysen");
		thrid.add("Europalaan");
		thrid.add("Europqsefkljqzzefjklmzqefjklmzeqffjklmzefqjmqelkfjzeqmflkzejqfmlkzqjfzemklfjzemlfkzejfmlzekjfzelmkfjemflkzejfmzeqkfjmezfzqefalaan");
		thrid.add("Europalaaqzeflqzkekjfzqelmfkjzeqfomzeqfzeqfzeqfzeqfzeqfzeqfzeqn");
		data.add(thrid);
		
		thrid = new ArrayList<Object>();
		thrid.add("Josiane");
		thrid.add("Leysen");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		data.add(thrid);
		
		thrid = new ArrayList<Object>();
		thrid.add("Josiane");
		thrid.add("Leysen");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		thrid.add("Europalaan");
		data.add(thrid);
		
	
		
		
		TableModel model = new DefaultTableModel(data,columns);
		
		Log.d("bert","size of model rows is " + model.getRowCount());
		//Log.d("bert","size of model rows is " + model.get);
		
		
		TableView t = new TableView(this,model);
		
		LayoutParams l = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		t.setLayoutParams(l);		
		
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
