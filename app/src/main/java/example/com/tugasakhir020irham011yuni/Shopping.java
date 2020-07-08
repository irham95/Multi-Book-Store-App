package example.com.tugasakhir020irham011yuni;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

import static android.R.string.no;
import static android.os.Build.VERSION_CODES.N;

/**
 * This app displays an order form to order coffee.
 */
public class Shopping extends AppCompatActivity {

    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_shopping);
    }


    public void increment(View view){//perintah tombol tambah
        if(quantity==100){
            Toast.makeText(this,"pesanan maximal 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity+1 ;
        display(quantity);
    }
    public void decrement(View view){//perintah tombol tambah
        if (quantity==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity -1;
        display(quantity);
    }


    public void Submitorder(View view) {
        EditText nameEditText=(EditText)findViewById(R.id.edt_name);
        String name=nameEditText.getText().toString();
        Log.v("Shopping","Nama:"+name);

        CheckBox book1ChekBox= (CheckBox) findViewById(R.id.Alamatdekat_checkbox);
        boolean hasbook=book1ChekBox.isChecked();//mengidentifikasi check
        Log.v("Shopping","Buku 1:"+hasbook);

        CheckBox book2ChekBox= (CheckBox) findViewById(R.id.Alamatjauh_checkbox);
        boolean hasbook2=book2ChekBox.isChecked();//mengidentifikasi check
        Log.v("Shopping","Buku 2:"+hasbook2);

        int price=calculateprice(hasbook,hasbook2);//memanggil method jumlah harga
        String pricemessage=createOrderSummary(price,name,hasbook,hasbook2);


        displayMessage(pricemessage);

    }
    private int calculateprice(boolean addbook1,boolean addbook2){//jumlah pesanan * harga
        int harga=35000;

        if(addbook1){
            harga=harga+45000;//harga tambahan toping
        }

        if (addbook2){
            harga=harga+5000;
        }

        return quantity * harga;
    }
    private String createOrderSummary(int price, String name, boolean addbook1, boolean addbook2) {//hasil pemesanan
        String pricemessage=" Nama = "+name;
        pricemessage+="\n Jumlah Buku (Satu Item) =" +addbook1;
        pricemessage+="\n Tambahkan Buku Anda =" +addbook2;
        pricemessage+="\n Jumlah Pemesanan =" +quantity;
        pricemessage+="\n Total = Rp " +price;
        pricemessage+="\n Terimakasih atas pemesanannya";
        return  pricemessage;
    }

    //method ini untuk mencetak hasil perintah yang di tampilkan dengan inisial quantity_textview di textview 0
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_textview);
        priceTextView.setText(message);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_textview);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_textview);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
