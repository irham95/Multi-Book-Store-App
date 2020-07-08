package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutPale6;
import example.com.tugasakhir020irham011yuni.R;

public class DetailThePaleHouse6 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_the_pale_house6);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_the_pale_house6);
        btlogin = findViewById(R.id.btpale);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btpale:
                Toast.makeText(this, "Beli The Pale House", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutPale6.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli The Pale House");
                startActivity(intentBeliBuku);
                break;
        }
    }
}
