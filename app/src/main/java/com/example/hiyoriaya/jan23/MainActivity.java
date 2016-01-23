package com.example.hiyoriaya.jan23;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private EditText mInputMassage;
    private Button mSendMassage;
    private LinearLayout mMassageLog;
    private TextView mCpuMassage;
    private TextView mUserMassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInputMassage = (EditText)findViewById(R.id.input_massage);
        mSendMassage = (Button)findViewById(R.id.send_massage);
        mMassageLog = (LinearLayout)findViewById(R.id.massage_log);
        mCpuMassage = (TextView)findViewById(R.id.cpu_massage);
        mUserMassage = (TextView)findViewById(R.id.user_massage);
        mSendMassage.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.send_massage){
            Toast.makeText(this,"デデーン",Toast.LENGTH_SHORT).show();
        }
    }
}
