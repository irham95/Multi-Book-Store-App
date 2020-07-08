package example.com.tugasakhir020irham011yuni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailSetiapBuku.DetailUtama;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    Button btndaftarbuku, btnshopping, btnslide, btnebook, btngalerifoto, btndashboard,  btnourpartner, btntentang ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        btndaftarbuku = findViewById(R.id.btn_daftarbuku);
        btnshopping = findViewById(R.id.btn_shopping);
        btnslide = findViewById(R.id.btn_slide);
        btnebook = findViewById(R.id.btn_ebook);
        btngalerifoto = findViewById(R.id.btn_galerifoto);
        btndashboard = findViewById(R.id.btn_dashboard);
        btnourpartner = findViewById(R.id.btn_ourpartner);
        btntentang = findViewById(R.id.btn_tentang);

        btndaftarbuku.setOnClickListener(this);
        btnshopping.setOnClickListener(this);
        btnslide.setOnClickListener(this);
        btnebook.setOnClickListener(this);
        btngalerifoto.setOnClickListener(this);
        btndashboard.setOnClickListener(this);
        btnourpartner.setOnClickListener(this);
        btntentang.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_daftarbuku:
                Toast.makeText(this, "Katalog Buku", Toast.LENGTH_SHORT).show();
                Intent intentDaftarBuku = new Intent(this, KatalogBuku.class);
                intentDaftarBuku.putExtra("KEY_TITLE", "Katalog Buku");
                startActivity(intentDaftarBuku);
                break;
            case R.id.btn_shopping:
                Toast.makeText(this, "Shopping", Toast.LENGTH_SHORT).show();
                Intent intentShopping = new Intent(this, DetailUtama.class);
                intentShopping.putExtra("KEY_TITLE", "Shopping");
                startActivity(intentShopping);
                break;
            case R.id.btn_slide:
                Toast.makeText(this, "Slide", Toast.LENGTH_SHORT).show();
                Intent intentSlide = new Intent(this, Slide.class);
                intentSlide.putExtra("KEY_TITLE", "Slide");
                startActivity(intentSlide);
                break;
            case R.id.btn_ebook:
                Toast.makeText(this, "Ebook", Toast.LENGTH_SHORT).show();
                Intent intentEbook = new Intent(this, Ebook.class);
                intentEbook.putExtra("KEY_TITLE", "Ebook");
                startActivity(intentEbook);
                break;

            case R.id.btn_gallery:
                Toast.makeText(this, "Gallery", Toast.LENGTH_SHORT).show();
                Intent intentGallery = new Intent(this, Gallery.class);
                intentGallery.putExtra("KEY_TITLE", "Ebook");
                startActivity(intentGallery);
                break;


            case R.id.btn_galerifoto:
                Toast.makeText(this, "Under Maintenance", Toast.LENGTH_SHORT).show();
                Intent intentGalerifoto = new Intent(this, SedangdiBangun.class);
                intentGalerifoto.putExtra("KEY_TITLE", "Under Maintenance");
                startActivity(intentGalerifoto);
                break;



            case R.id.btn_dashboard:
                Toast.makeText(this, "Dashboard", Toast.LENGTH_SHORT).show();
                Intent intentDashboard = new Intent(this, Dashboard.class);
                intentDashboard.putExtra("KEY_TITLE", "Dashboard");
                startActivity(intentDashboard);
                break;


            case R.id.btn_ourpartner:
                Toast.makeText(this, "Partnership", Toast.LENGTH_SHORT).show();
                Intent intentOurpartners = new Intent(this, OurPartners.class);
                intentOurpartners.putExtra("KEY_TITLE", "Partnership");
                startActivity(intentOurpartners);
                break;

            case R.id.btn_tentang:
                Toast.makeText(this, "Tentang Kami", Toast.LENGTH_SHORT).show();
                Intent intentTentang = new Intent(this, TentangKami.class);
                intentTentang.putExtra("KEY_TITLE", "Tentang Kami");
                startActivity(intentTentang);
                break;
        }

    }
}


