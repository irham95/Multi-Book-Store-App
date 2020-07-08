package example.com.tugasakhir020irham011yuni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutHarpot3;

public class DetailHalfBlood extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_half_blood);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_half_blood);
        btlogin = findViewById(R.id.btharryhalf);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btharryhalf:
                Toast.makeText(this, "Beli Harry Potter and the Half Blood Prince", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutHarpot3.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli Harry Potter and the Half Blood Prince");
                startActivity(intentBeliBuku);
                break;
        }
    }
}
