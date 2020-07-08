package example.com.tugasakhir020irham011yuni;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class GaleriFoto extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    String[] judul;
    String[] keterangan;
    int[] gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri_foto);

        judul = new String[]{
                "Cumi Pedas", "Perkedel Gurih", "Rendang Padang"
        };

        keterangan = new String[] {
                "Masakan enak darimolahan cumi yang lembut dan enak, fresh dari laut",
                "Perkedel sebgai lauk yang banyak disukai, selain gurih dan enak juga banyak gizi",
                "Rendang khas Padang, dagiing yang lembut "
        };

        gambar = new int[] {
                R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_2
        };

        viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new ViewPageAdapter(GaleriFoto.this,judul,keterangan,gambar);
        viewPager.setAdapter(adapter);
    }
}
