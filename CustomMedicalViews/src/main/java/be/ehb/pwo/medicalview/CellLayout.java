package be.ehb.pwo.medicalview;

import android.graphics.Typeface;
import android.widget.TextView;

public class CellLayout {
	private int textColor = Integer.MAX_VALUE;
	private int textColorHighlight = Integer.MAX_VALUE;
	private Typeface typeface;
	private int background = Integer.MAX_VALUE;

	public void applyToElement(TextView tv){
		if(textColor != Integer.MAX_VALUE)
			tv.setTextColor(textColor);
		if(textColorHighlight != Integer.MAX_VALUE)
			tv.setHighlightColor(textColorHighlight);
		if(typeface != null)
			tv.setTypeface(typeface);
		if(background != Integer.MAX_VALUE)
			tv.setBackgroundColor(background);
		
	}
	
	public int getTextColor() {
		return textColor;
	}
	public void setTextColor(int textColor) {
		this.textColor = textColor;
	}
	public int getTextColorHighlight() {
		return textColorHighlight;
	}
	public void setTextColorHighlight(int textColorHighlight) {
		this.textColorHighlight = textColorHighlight;
	}
	public Typeface getTypeface() {
		return typeface;
	}
	public void setTypeface(Typeface typeface) {
		this.typeface = typeface;
	}

	public int getBackground() {
		return background;
	}
	public void setBackground(int background) {
		this.background = background;
	}
	

}
