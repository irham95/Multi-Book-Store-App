package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutHarpot12;
import example.com.tugasakhir020irham011yuni.R;

public class DetailHarpotSorcerer12 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_harpot_sorcerer12);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_harpot_sorcerer12);
        btlogin = findViewById(R.id.har);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.har:
                Toast.makeText(this, "Beli Harry Potter and the Sorcerers Stone", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutHarpot12.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli Harry Potter and the Sorcerers Stone");
                startActivity(intentBeliBuku);
                break;
        }
    }
}

