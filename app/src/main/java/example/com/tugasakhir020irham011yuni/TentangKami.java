package example.com.tugasakhir020irham011yuni;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TentangKami extends AppCompatActivity {

    ImageView imageview;
    Button button;
    Boolean turnOn=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tentang_kami);

        imageview=(ImageView)findViewById(R.id.imageView);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!turnOn){
                    imageview.setImageResource(R.drawable.trans_on);
                    ((TransitionDrawable)imageview.getDrawable()).startTransition(3000);
                    turnOn=true;
                }else {
                    imageview.setImageResource(R.drawable.trans_off);
                    ((TransitionDrawable)imageview.getDrawable()).startTransition(3000);
                    turnOn=false;

                }



            }
        });
    }
}
