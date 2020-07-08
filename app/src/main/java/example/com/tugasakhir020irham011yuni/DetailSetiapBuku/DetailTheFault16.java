package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutFault16;
import example.com.tugasakhir020irham011yuni.R;

public class DetailTheFault16 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_the_fault16);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_the_fault16);
        btlogin = findViewById(R.id.fault);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fault:
                Toast.makeText(this, "Beli The Fault in our Stars", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutFault16.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli The Fault in our Stars");
                startActivity(intentBeliBuku);
                break;
        }
    }
}

