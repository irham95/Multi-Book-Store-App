package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.R;

public class DetailYellow10 extends AppCompatActivity implements View.OnClickListener{

    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_yellow10);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_yellow10);
        btlogin = findViewById(R.id.btLoginy);


        btlogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btLoginy:
                Toast.makeText(this, "Stok Habis", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
