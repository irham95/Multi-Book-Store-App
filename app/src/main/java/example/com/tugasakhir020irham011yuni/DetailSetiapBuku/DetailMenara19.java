package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOut5Menara19;
import example.com.tugasakhir020irham011yuni.R;

public class DetailMenara19 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menara19);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_menara19);
        btlogin = findViewById(R.id.menara);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menara:
                Toast.makeText(this, "Beli Negeri 5 Menara", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOut5Menara19.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli Negeri 5 Menara");
                startActivity(intentBeliBuku);
                break;
        }
    }
}

