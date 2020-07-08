package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutTwilight14;
import example.com.tugasakhir020irham011yuni.R;

public class DetailTwilight14 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_twilight14);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_twilight14);
        btlogin = findViewById(R.id.twilight);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.twilight:
                Toast.makeText(this, "Beli Twilight", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutTwilight14.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli Twilight");
                startActivity(intentBeliBuku);
                break;
        }
    }
}

