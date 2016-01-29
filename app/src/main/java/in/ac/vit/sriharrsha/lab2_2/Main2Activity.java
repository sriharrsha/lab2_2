package in.ac.vit.sriharrsha.lab2_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView message=(TextView)findViewById(R.id.textView);
        message.setText(getIntent().getStringExtra("message"));

    }

}
