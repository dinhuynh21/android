package code.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    EditText ed1,ed2;
    Spinner sp1;
    String t;
    Button bt;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        ed1=(EditText)findViewById(R.id.edittext1);
        ed2=(EditText)findViewById(R.id.edittext2);
        sp1=(Spinner)findViewById(R.id.spinner1);
        bt=(Button)findViewById(R.id.button1);

    }
    public void showMe(View v){
        int i=Integer.parseInt(ed1.getText().toString());
        int j=Integer.parseInt(ed2.getText().toString());
        String t= (String) sp1.getSelectedItem();
        if(t.equals("Cộng")){
            Toast.makeText(getApplicationContext(),String.valueOf(i+j),Toast.LENGTH_LONG).show();
        }
        if(t.equals("Trừ"))
            Toast.makeText(getApplicationContext(),String.valueOf(i-j),Toast.LENGTH_LONG).show();
        if(t.equals("Nhân"))
            Toast.makeText(getApplicationContext(),String.valueOf(i*j),Toast.LENGTH_LONG).show();
        if(t.equals("Chia"))
            Toast.makeText(getApplicationContext(),String.valueOf(i/j),Toast.LENGTH_LONG).show();
    }


}
