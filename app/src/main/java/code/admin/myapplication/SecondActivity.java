package code.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    String hoten;
    EditText ed;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void showMe(View v){
        ed = (EditText)findViewById(R.id.EditText01);
        hoten ="Xon chào"+ed.getText().toString();
        Toast.makeText(getApplicationContext(),hoten,Toast.LENGTH_LONG).show();
    }
}
