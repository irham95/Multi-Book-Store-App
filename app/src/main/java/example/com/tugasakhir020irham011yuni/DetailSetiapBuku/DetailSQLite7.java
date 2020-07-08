package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOut5Hari7;
import example.com.tugasakhir020irham011yuni.R;

public class DetailSQLite7 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sqlite7);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_sqlite7);
        btlogin = findViewById(R.id.sq);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sq:
                Toast.makeText(this, "Beli 5 Hari Menguasai AS dan SQ Lite", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOut5Hari7.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli 5 Hari Menguasai AS dan SQ Lite");
                startActivity(intentBeliBuku);
                break;
        }
    }
}

