package edu.cecar.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	private TextView operationText;
	private Button oneButton;
	private Button twoButton;
	private Button threeButton;
	private Button fourButton;
	private Button fiveButton;
	private Button sixButton;
	private Button sevenButton;
	private Button eightButton;
	private Button nineButton;
	private Button zeroButton;
	private Button addButton;
	private Button subButton;
	private Button multButton;
	private Button divButton;
	private Button resButton;
	private ImageButton backButton;
	private String operations = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Operation view
		operationText = (TextView) findViewById(R.id.operationText);
		operationText.setText("0");

		// Number buttons
		oneButton = (Button) findViewById(R.id.oneButton);
		twoButton = (Button) findViewById(R.id.twoButton);
		threeButton = (Button) findViewById(R.id.threeButton);
		fourButton = (Button) findViewById(R.id.fourButton);
		fiveButton = (Button) findViewById(R.id.fiveButton);
		sixButton = (Button) findViewById(R.id.sixButton);
		sevenButton = (Button) findViewById(R.id.sevenButton);
		eightButton = (Button) findViewById(R.id.eightButton);
		nineButton = (Button) findViewById(R.id.nineButton);
		zeroButton = (Button) findViewById(R.id.zeroButton);

		oneButton.setOnClickListener(this);
		twoButton.setOnClickListener(this);
		threeButton.setOnClickListener(this);
		fourButton.setOnClickListener(this);
		fiveButton.setOnClickListener(this);
		sixButton.setOnClickListener(this);
		sevenButton.setOnClickListener(this);
		eightButton.setOnClickListener(this);
		nineButton.setOnClickListener(this);
		zeroButton.setOnClickListener(this);

		// Operations buttons
		addButton = (Button) findViewById(R.id.addButton);
		subButton = (Button) findViewById(R.id.subButton);
		multButton = (Button) findViewById(R.id.multButton);
		divButton = (Button) findViewById(R.id.divButton);
		backButton = (ImageButton) findViewById(R.id.backImageButton);
		resButton = (Button) findViewById(R.id.reslButton);

		addButton.setOnClickListener(this);
		subButton.setOnClickListener(this);
		multButton.setOnClickListener(this);
		divButton.setOnClickListener(this);
		backButton.setOnClickListener(this);
		resButton.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {

		String tapedValue = "";
		boolean operation = false;

		if (operations.length() > 0) {
			
			String lastChart = operations.substring(operations.length() - 1);
			
			if (lastChart.equals("+") || lastChart.equals("-")
					|| lastChart.equals("x") || lastChart.equals("÷"))
				operation = true;
		}

		switch (v.getId()) {

		case R.id.oneButton:
			tapedValue = "1";
			operations += tapedValue;

			break;
		case R.id.twoButton:
			tapedValue = "2";
			operations += tapedValue;

			break;
		case R.id.threeButton:
			tapedValue = "3";
			operations += tapedValue;

			break;
		case R.id.fourButton:
			tapedValue = "4";
			operations += tapedValue;

			break;
		case R.id.fiveButton:
			tapedValue = "5";
			operations += tapedValue;

			break;
		case R.id.sixButton:
			tapedValue = "6";
			operations += tapedValue;

			break;
		case R.id.sevenButton:
			tapedValue = "7";
			operations += tapedValue;

			break;
		case R.id.eightButton:
			tapedValue = "8";
			operations += tapedValue;

			break;
		case R.id.nineButton:
			tapedValue = "9";
			operations += tapedValue;

			break;
		case R.id.zeroButton:
			tapedValue = "0";
			operations += tapedValue;

			break;

		case R.id.addButton:

			if (!operation && operations.length() > 0)
				operations += "+";
			break;

		case R.id.subButton:
			if (!operation && operations.length() > 0)
				operations += "-";
			break;

		case R.id.multButton:
			if (!operation && operations.length() > 0)
				operations += "x";
			break;

		case R.id.divButton:
			if (!operation && operations.length() > 0)
				operations += "÷";
			break;

		case R.id.reslButton:

			break;

		case R.id.backImageButton:
			if (operations.length() > 0)
				operations = operations.substring(0, operations.length() - 1);
			else
				operationText.setText("0");
			break;
		}
		
		if(operations.equals(""))
			operations = "0";
		
		operationText.setText(operations);
	}
}
