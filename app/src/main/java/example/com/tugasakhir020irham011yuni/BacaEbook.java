package example.com.tugasakhir020irham011yuni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BacaEbook extends AppCompatActivity implements View.OnClickListener{

    Button tintin, goos, fear, narnia, mobile, sismik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_baca_ebook);
        tintin = findViewById(R.id.bacatintin);
        goos = findViewById(R.id.bacagoosebumps);
        fear = findViewById(R.id.bacafearstreet);
        narnia = findViewById(R.id.bacanarnia);
        mobile = findViewById(R.id.bacaandroid);
        sismik = findViewById(R.id.bacasismik);


        tintin.setOnClickListener(this);
        goos.setOnClickListener(this);
        fear.setOnClickListener(this);
        narnia.setOnClickListener(this);
        mobile.setOnClickListener(this);
        sismik.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bacatintin:
                Toast.makeText(this, "Tintin", Toast.LENGTH_SHORT).show();
                Intent intentDaftarBuku = new Intent(this, BacaEbookTintin.class);
                intentDaftarBuku.putExtra("KEY_TITLE", "Tintin");
                startActivity(intentDaftarBuku);
                break;
            case R.id.bacagoosebumps:
                Toast.makeText(this, "Goosebumps", Toast.LENGTH_SHORT).show();
                Intent intentShopping = new Intent(this, BacaEbook1.class);
                intentShopping.putExtra("KEY_TITLE", "Goosebumps");
                startActivity(intentShopping);
                break;
            case R.id.bacafearstreet:
                Toast.makeText(this, "Fear Street", Toast.LENGTH_SHORT).show();
                Intent intentSlide = new Intent(this, BacaEbookFear.class);
                intentSlide.putExtra("KEY_TITLE", "Fear Street");
                startActivity(intentSlide);
                break;
            case R.id.bacanarnia:
                Toast.makeText(this, "Narnia", Toast.LENGTH_SHORT).show();
                Intent intentEbook = new Intent(this, BacaEbookNarnia.class);
                intentEbook.putExtra("KEY_TITLE", "Narnia");
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
