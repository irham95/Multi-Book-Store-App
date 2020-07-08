package example.com.tugasakhir020irham011yuni;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //KODINGAN UNTUK FULL LAYAR SEMUA SELAIN NO ACTION BAR
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //KODINGAN UNTUK FULL LAYAR SEMUA SELAIN NO ACTION BAR
        //Tinggal tambahkan kodingan ini di setiap Activity di dalam onCreate//

        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent login=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login);
                finish();

            }
        },waktu_loading);
    }
}
