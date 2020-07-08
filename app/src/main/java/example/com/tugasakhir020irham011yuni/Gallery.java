package example.com.tugasakhir020irham011yuni;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class Gallery extends Activity implements OnItemClickListener, OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_gallery);
        GridView gridView = (GridView) findViewById(R.id.gridview_followed);
        gridView.setAdapter(new ImageAdapter (this));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        // TODO Auto-generated method stub
        Toast.makeText(Gallery.this, "Klik di"+position, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, SingleImage.class);
        Bundle b = new Bundle();
        b.putInt("posisi", position);
        i.putExtras(b);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
    }
}


