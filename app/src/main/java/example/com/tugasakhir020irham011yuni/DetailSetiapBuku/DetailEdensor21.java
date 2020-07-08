package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutEdensor21;
import example.com.tugasakhir020irham011yuni.R;

public class DetailEdensor21 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_edensor21);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_edensor21);
        btlogin = findViewById(R.id.eden);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.eden:
                Toast.makeText(this, "Beli Edensor", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutEdensor21.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli Edensor");
                startActivity(intentBeliBuku);
                break;
        }
    }
}

