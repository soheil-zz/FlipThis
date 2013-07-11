package com.jogalot.android.flipthis;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText editText; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText = (EditText) findViewById(R.id.editText1);
		editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) { flipIt(); }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }
        });
	}
	
	void flipIt() {
		TextView textView = (TextView) findViewById(R.id.textView1);
		EditText editText = (EditText) findViewById(R.id.editText1);

        int len = editText.getText().length();
        StringBuilder out = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
        	out.append(upsideDown(editText.getText().charAt(i)));
        }
		
		textView.setText(out);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private String upsideDown(Character ch) {
		switch (ch) {
			case 'a': return "\u0250";
			case 'A': return "\u0250";
			case 'b': return "q";
			case 'B': return "q";
			case 'c': return "\u0254";
			case 'C': return "\u0254";
			case 'd': return "p";
			case 'D': return "p";
			case 'e': return "\u01dd";
			case 'E': return "\u01dd";
			case 'f': return "\u025f";
			case 'F': return "\u025f";
			case 'g': return "\u0183";
			case 'G': return "\u0183";
			case 'h': return "\u0265";
			case 'H': return "\u0265";
			case 'i': return "\u0131";
			case 'I': return "\u0131";
			case 'j': return "\u027e";
			case 'J': return "\u027e";
			case 'k': return "\u029e";
			case 'K': return "\u029e";
			case 'l': return "l";
			case 'L': return "l";
			case 'm': return "\u026f";
			case 'M': return "\u026f";
			case 'n': return "u";
			case 'N': return "u";
			case 'o': return "o";
			case 'O': return "o";
			case 'p': return "d";
			case 'P': return "d";
			case 'q': return "b";
			case 'Q': return "b";
			case 'r': return "\u0279";
			case 'R': return "\u0279";
			case 's': return "s";
			case 'S': return "s";
			case 't': return "\u0287";
			case 'T': return "\u0287";
			case 'u': return "n";
			case 'U': return "n";
			case 'v': return "\u028c";
			case 'V': return "\u028c";
			case 'w': return "\u028d";
			case 'W': return "\u028d";
			case 'x': return "x";
			case 'X': return "x";
			case 'y': return "\u028e";
			case 'Y': return "\u028e";
			case 'z': return "z";
			case 'Z': return "z";
			case '0': return "0";
			case '1': return "\u21c2";
			case '2': return "\u1105";
			case '3': return "\u1110";
			case '4': return "\u3123";
			case '5': return "S";
			case '6': return "9";
			case '7': return "L";
			case '8': return "8";
			case '9': return "6";
			case ' ': return " ";
			case '\n': return "<br />";
			case '.': return "\u02d9";
			case ',': return "\'";
			case '\'': return ",";
			case '\"': return ",,";
			case '!': return "Á";
			case '?': return "\u00bf";
			case '@': return "@";
			case '#': return "#";
			case '$': return "$";
			case '%': return "%";
			case '^': return "v";
			case '/': return "/";
			case '\\': return "\\";
			case '<': return ">";
			case '>': return "<";
			case '(': return ")";
			case ')': return "(";
			case '[': return "]";
			case ']': return "[";
			case '{': return "}";
			case '}': return "{";
			case ':': return ":";
			case '*': return "*";
			case '-': return "-";
			case '+': return "+";
			case '=': return "=";
			case '&': return "+";
			default: return "";
		}
	}
}
