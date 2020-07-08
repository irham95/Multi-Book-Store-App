package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutHunger13;
import example.com.tugasakhir020irham011yuni.R;

public class DetailHunger13 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hunger13);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_hunger13);
        btlogin = findViewById(R.id.hunger);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hunger:
                Toast.makeText(this, "Beli The Hunger Games", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutHunger13.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli The Hunger Games");
                startActivity(intentBeliBuku);
                break;
        }
    }
}

