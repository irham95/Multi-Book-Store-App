package example.com.tugasakhir020irham011yuni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{

    Button btnprofil, btnsearchus, btnnotif, btnmsg, btnscan, btnreview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);
        btnprofil = findViewById(R.id.btn_profil);
        btnsearchus = findViewById(R.id.btn_searchus);
        btnnotif = findViewById(R.id.btn_notif);
        btnmsg = findViewById(R.id.btn_sms);
        btnscan = findViewById(R.id.btn_scannerbook);
        btnreview = findViewById(R.id.btn_review);

        btnprofil.setOnClickListener(this);
        btnsearchus.setOnClickListener(this);
        btnnotif.setOnClickListener(this);
        btnmsg.setOnClickListener(this);
        btnscan.setOnClickListener(this);
        btnreview.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_profil:
                Toast.makeText(this, "Profil", Toast.LENGTH_SHORT).show();
                Intent intentProfil = new Intent(this, TentangKami.class);
                intentProfil.putExtra("KEY_TITLE", "Profil");
                startActivity(intentProfil);
                break;


            case R.id.btn_searchus:
                Toast.makeText(this, "Search Us", Toast.LENGTH_SHORT).show();
                Intent intentSearchus = new Intent(this, ActivityProfil.class);
                intentSearchus.putExtra("KEY_TITLE", "Search Us");
                startActivity(intentSearchus);
                break;


            case R.id.btn_notif:
                Toast.makeText(this, "Jam", Toast.LENGTH_SHORT).show();
                Intent intentScan = new Intent(this, Jam.class);
                intentScan.putExtra("KEY_TITLE", "Jam");
                startActivity(intentScan);
                break;


            case R.id.btn_sms:
                Toast.makeText(this, "SMS", Toast.LENGTH_SHORT).show();
                Intent intentSms = new Intent(this, SMS.class);
                intentSms.putExtra("KEY_TITLE", "SMS");
                startActivity(intentSms);
                break;



            case R.id.btn_scannerbook:
                Toast.makeText(this, "Scanner", Toast.LENGTH_SHORT).show();
                Intent intentJam = new Intent(this, Barcode.class);
                intentJam.putExtra("KEY_TITLE", "Scanner");
                startActivity(intentJam);
                break;

            case R.id.btn_review:
                Toast.makeText(this, "Review", Toast.LENGTH_SHORT).show();
                Intent intentReview = new Intent(this, Feedback.class);
                intentReview.putExtra("KEY_TITLE", "Review");
                startActivity(intentReview);
                break;

        }

    }
}
