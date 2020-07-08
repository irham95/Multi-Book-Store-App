package example.com.tugasakhir020irham011yuni;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class SingleImage extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_image);

        int imId = this.getIntent().getExtras().getInt("posisi");
        ImageView iv = (ImageView) findViewById(R.id.singleimage);
        int image = ImageAdapter.mThumbIds[imId];
        iv.setImageResource(image);

    }
}
