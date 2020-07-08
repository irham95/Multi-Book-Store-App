package example.com.tugasakhir020irham011yuni.DetailCheckout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailCheckout2.COPerahu23;
import example.com.tugasakhir020irham011yuni.R;

public class CheckOutPerahu23 extends AppCompatActivity implements View.OnClickListener{


    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out_perahu23);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_check_out_perahu23);
        btlogin = findViewById(R.id.btCheckout23);


        btlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btCheckout23:
                Toast.makeText(this, "Beli", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, COPerahu23.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Beli");
                startActivity(intentBeliBuku);
                break;
        }
    }
}
