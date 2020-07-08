package example.com.tugasakhir020irham011yuni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityProfil extends AppCompatActivity implements View.OnClickListener {
    Button btnig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profil);
        btnig = findViewById(R.id.button_ig);

        btnig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_ig:
                    Toast.makeText(this, "Halaman Scroll IG", Toast.LENGTH_SHORT).show();
                    Intent intentIG = new Intent(this, InstagramPromosi.class);
                    intentIG.putExtra("KEY_TITLE", "Halaman Scroll IG");
                    startActivity(intentIG);
                    break;

            }
        }
    }
