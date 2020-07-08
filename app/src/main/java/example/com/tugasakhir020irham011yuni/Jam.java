package example.com.tugasakhir020irham011yuni;


import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextClock;

import androidx.appcompat.app.AppCompatActivity;

public class Jam extends AppCompatActivity {
    TextClock jamdigital;
    Button tomboljam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_jam);

        TextClock jam1 = (TextClock)findViewById(R.id.jam1);

        jamdigital = (TextClock)findViewById(R.id.jam2);
        jamdigital.setVisibility(View.INVISIBLE);

        tomboljam = (Button)findViewById(R.id.button1);
    }
    public void showTextClock(View view){
        jamdigital.setVisibility(view.VISIBLE);
        tomboljam.setText("Tampilkan Jam Digital");
    }
    public void keluar (View view){
        finish();
    }
}
