package example.com.tugasakhir020irham011yuni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class KatalogBuku extends AppCompatActivity implements View.OnClickListener{

    Button daftarbuku, listtoko, galeri, ebookonline, mobile, sismik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_katalog_buku);
        daftarbuku = findViewById(R.id.btn_daftarbukusaya);
        listtoko = findViewById(R.id.btn_list);
        galeri = findViewById(R.id.btn_gallery);
        ebookonline = findViewById(R.id.btn_ebookonline);
        mobile = findViewById(R.id.bacaandroid);
        sismik = findViewById(R.id.bacasismik);


        daftarbuku.setOnClickListener(this);
        listtoko.setOnClickListener(this);
        galeri.setOnClickListener(this);
        ebookonline.setOnClickListener(this);
        mobile.setOnClickListener(this);
        sismik.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_daftarbukusaya:
                Toast.makeText(this, "Daftar Buku", Toast.LENGTH_SHORT).show();
                Intent intentDaftarBuku = new Intent(this, DaftarBuku.class);
                intentDaftarBuku.putExtra("KEY_TITLE", "Daftar Buku");
                startActivity(intentDaftarBuku);
                break;
            case R.id.btn_list:
                Toast.makeText(this, "List Buku", Toast.LENGTH_SHORT).show();
                Intent intentShopping = new Intent(this, DataMahasiswaActivity.class);
                intentShopping.putExtra("KEY_TITLE", "List Buku");
                startActivity(intentShopping);
                break;
            case R.id.btn_gallery:
                Toast.makeText(this, "Gallery", Toast.LENGTH_SHORT).show();
                Intent intentSlide = new Intent(this, Gallery.class);
                intentSlide.putExtra("KEY_TITLE", "Gallery");
                startActivity(intentSlide);
                break;
            case R.id.btn_ebookonline:
                Toast.makeText(this, "Ebook", Toast.LENGTH_SHORT).show();
                Intent intentEbook = new Intent(this, BacaEbook.class);
                intentEbook.putExtra("KEY_TITLE", "Ebook");
                startActivity(intentEbook);
                break;

            case R.id.bacaandroid:
                Toast.makeText(this, "Pemrograman Android", Toast.LENGTH_SHORT).show();
                Intent intentGallery = new Intent(this, BacaAndroid.class);
                intentGallery.putExtra("KEY_TITLE", "Pemrograman Android");
                startActivity(intentGallery);
                break;


            case R.id.bacasismik:
                Toast.makeText(this, "Sistem Mikroprosesor", Toast.LENGTH_SHORT).show();
                Intent intentGalerifoto = new Intent(this, BacaSismik.class);
                intentGalerifoto.putExtra("KEY_TITLE", "Sistem Mikroprosesor");
                startActivity(intentGalerifoto);
                break;




        }

    }
}
