package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutAnd8;
import example.com.tugasakhir020irham011yuni.R;

public class DetailAndThen8 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_and_then8);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_and_then8);
        btlogin = findViewById(R.id.and);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.and:
                Toast.makeText(this, "Beli And Then There Were None", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutAnd8.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli And Then There Were None");
                startActivity(intentBeliBuku);
                break;
        }
    }
}

