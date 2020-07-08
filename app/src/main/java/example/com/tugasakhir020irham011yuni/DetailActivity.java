package example.com.tugasakhir020irham011yuni;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvName = findViewById(R.id.tv_name); TextView tvDesc =
                findViewById(R.id.tv_description);
        ImageView ivPhoto = findViewById(R.id.iv_photo);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("NAME");
            String desc = bundle.getString("DESC");
            int picture = bundle.getInt("PHOTO");

            tvName.setText(name); tvDesc.setText(desc); ivPhoto.setImageResource(picture);

            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle("Detail Mahasiswa : " + name);
            }
        }

    }
}

