package example.com.tugasakhir020irham011yuni;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class DetailMakananBuku extends AppCompatActivity {

    ImageView imgdetailmakanan;
    TextView txtdetailnamamakanan;
    TextView txtDetalmakanan;
    TextView txthargamakanan;
    ImageView imgcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan_buku);

        imgdetailmakanan = (ImageView) findViewById(R.id.imgdetailmakanan);
        imgcall = (ImageView) findViewById(R.id.imgcall);

        imgcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:089689696474"));
                if (ActivityCompat.checkSelfPermission(DetailMakananBuku.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
//                        ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
//                       public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                                                              int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.

//                    return;

                    String toDial="tel:089689696474";

                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(toDial)));

                }
                startActivity(intent);
            }
        });

        txtdetailnamamakanan = (TextView)findViewById(R.id.txtdetailnamamakanan);
        txtDetalmakanan = (TextView)findViewById(R.id.txtdetailmakanan);
        txthargamakanan = (TextView)findViewById(R.id.txtdetailhargamakanan);


        Intent terimadata = getIntent();

        txtdetailnamamakanan.setText(terimadata.getStringExtra("namaM"));
        txthargamakanan.setText(terimadata.getStringExtra("hargaM"));
        txtDetalmakanan.setText(terimadata.getIntExtra("detailM",0));
        imgdetailmakanan.setImageResource (terimadata.getIntExtra("gbrM",0));

    }
}
