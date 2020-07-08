package example.com.tugasakhir020irham011yuni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout.CheckOutHobbit4;

public class DetailHobbit extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hobbit);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_hobbit);
        btlogin = findViewById(R.id.bthobbit);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bthobbit:
                Toast.makeText(this, "Beli The Hobbit", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, CheckOutHobbit4.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli The Hobbit");
                startActivity(intentBeliBuku);
                break;
        }
    }
}
