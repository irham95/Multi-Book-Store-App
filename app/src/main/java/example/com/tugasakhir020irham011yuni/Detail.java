package example.com.tugasakhir020irham011yuni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail2);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            Hero detailditerima = getIntent().getParcelableExtra("key");

            ImageView gambar = (ImageView)findViewById(R.id.img_item_photo);
            TextView name = (TextView)findViewById(R.id.tv_item_name);
            TextView deskripsi = (TextView)findViewById(R.id.content_detail);


            Glide.with(this).load(detailditerima.getPhoto()).override(350,550).into(gambar);
            name.setText(detailditerima.getName());
            deskripsi.setText(detailditerima.getDetail());

           // Log.i("deskripsi", detailditerima.getDetail());
        }


    }
