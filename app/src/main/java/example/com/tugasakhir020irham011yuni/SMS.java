package example.com.tugasakhir020irham011yuni;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SMS extends AppCompatActivity {
    private Button btnSend;
    private EditText tvMessage;
    private EditText tvNumber;
    IntentFilter intentFilter;

    private BroadcastReceiver intentReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            //display the message in the textview
            TextView inTxt = (TextView) findViewById(R.id.txtMessage);
            inTxt.setText(intent.getExtras().getString("message"));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sms);

        //intent to filter for SMS message received
        intentFilter = new IntentFilter();
        intentFilter.addAction("SMS_RECEIVED_ACTION");

        btnSend = (Button) findViewById(R.id.btnSend);
        tvNumber = (EditText) findViewById(R.id.tvNumber);
        tvMessage = (EditText) findViewById(R.id.tvMessage);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myMsg = tvMessage.getText().toString();
                String txtNumber = tvNumber.getText().toString();
                sendMsg(txtNumber, myMsg);
            }
        });
    }

    private void sendMsg(String txtNumber, String myMsg) {
        String SENT = "Message Send";
        String DELIVERED = "Message Delivered";

        PendingIntent sentPi = PendingIntent.getBroadcast(this, 0, new Intent(SENT), 0);
        PendingIntent deliveredPi = PendingIntent.getBroadcast(this, 0, new Intent(DELIVERED), 0);

        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(txtNumber, null, myMsg, sentPi, deliveredPi);
    }

    @Override
    protected void onResume() {
        //register the receiver
        registerReceiver(intentReceiver, intentFilter);
        super.onResume();
    }

    @Override
    protected void onPause() {
        //unregister the receiver
        unregisterReceiver(intentReceiver);
        super.onPause();
    }
}
