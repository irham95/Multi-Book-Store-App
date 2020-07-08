package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutHaunted11;
import example.com.tugasakhir020irham011yuni.R;

public class DetailHauntedMask11 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_haunted_mask11);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_haunted_mask11);
        btlogin = findViewById(R.id.hau);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hau:
                Toast.makeText(this, "Beli The Haunted House", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutHaunted11.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli The Haunted House");
                startActivity(intentBeliBuku);
                break;
        }
    }
}

