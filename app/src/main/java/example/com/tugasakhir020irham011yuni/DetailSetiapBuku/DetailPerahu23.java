package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutPerahu23;
import example.com.tugasakhir020irham011yuni.R;

public class DetailPerahu23 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_perahu23);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_perahu23);
        btlogin = findViewById(R.id.perahu);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.perahu:
                Toast.makeText(this, "Beli Perahu Kertas", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutPerahu23.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli Perahu Kertas");
                startActivity(intentBeliBuku);
                break;
        }
    }
}

