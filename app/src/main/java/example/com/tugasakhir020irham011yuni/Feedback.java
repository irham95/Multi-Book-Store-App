package example.com.tugasakhir020irham011yuni;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;

public class Feedback extends AppCompatActivity {

    private TextView getRating;
    private Button Submit;
    private AppCompatRatingBar RatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_feedback);
        getRating = findViewById(R.id.rate);
        Submit = findViewById(R.id.submit);
        RatingBar = findViewById(R.id.penilaian);


        RatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float nilai, boolean b) {

                getRating.setText("Rating: "+nilai);
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Terimakasih, Nilai Yang Anda Kirimkan: "+RatingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
