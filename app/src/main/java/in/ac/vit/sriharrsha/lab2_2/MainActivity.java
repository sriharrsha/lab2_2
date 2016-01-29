package in.ac.vit.sriharrsha.lab2_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nextPage(View v){
        EditText entered=(EditText)findViewById(R.id.editText);
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("message",entered.getText().toString());
        startActivity(intent);
    }
}
