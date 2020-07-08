package example.com.tugasakhir020irham011yuni.DetailCheckout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout2.DetailCheckoutDaddyOut1;
import example.com.tugasakhir020irham011yuni.R;

public class DetailCheckoutDaddy1 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_checkout_daddy1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_checkout_daddy1);
        btlogin = findViewById(R.id.btCheckout1);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btCheckout1:
                Toast.makeText(this, "Beli", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, DetailCheckoutDaddyOut1.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli");
                startActivity(intentBeliBuku);
                break;
        }
    }
}
