package example.com.tugasakhir020irham011yuni.Kirim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;

import example.com.tugasakhir020irham011yuni.HomeActivity;
import example.com.tugasakhir020irham011yuni.R;

public class KHH4 extends AppCompatActivity implements View.OnClickListener {
    Button btback;

    private TextView getRating;
    private Button Submit;
    private AppCompatRatingBar RatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_khh4);
        getRating = findViewById(R.id.rate);
        Submit = findViewById(R.id.submit);
        RatingBar = findViewById(R.id.penilaiand);
        btback = findViewById(R.id.backtomenu);


        btback.setOnClickListener(this);


        RatingBar.setOnRatingBarChangeListener(new android.widget.RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(android.widget.RatingBar ratingBar, float nilai, boolean b) {

                getRating.setText("Rating: " + nilai);
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Terimakasih, Nilai Yang Anda Kirimkan: " + RatingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backtomenu:
                Toast.makeText(this, "Kembali", Toast.LENGTH_SHORT).show();
                Intent intentBeliBuku = new Intent(this, HomeActivity.class);
                intentBeliBuku.putExtra("KEY_TITLE", "Kembali");
                startActivity(intentBeliBuku);
                break;
        }
    }
}
