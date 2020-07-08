package example.com.tugasakhir020irham011yuni.DetailSetiapBuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import example.com.tugasakhir020irham011yuni.DetailHalfBlood;
import example.com.tugasakhir020irham011yuni.DetailHobbit;
import example.com.tugasakhir020irham011yuni.R;

public class DetailUtama extends AppCompatActivity implements View.OnClickListener {

    Button btndetail1, btndetail2, btndetail3, btndetail4, btndetail5, btndetail6, btndetail7,
            btndetail8, btndetail9, btndetail10, btndetail11, btndetail12, btndetail13,
            btndetail14, btndetail15, btndetail16, btndetail17, btndetail18, btndetail19,
            btndetail20, btndetail21, btndetail22, btndetail23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_utama);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail_utama);
        btndetail1 = findViewById(R.id.btn_detail1);
        btndetail2 = findViewById(R.id.btn_detail2);
        btndetail3 = findViewById(R.id.btn_detail3);
        btndetail4 = findViewById(R.id.btn_detail4);
        btndetail5 = findViewById(R.id.btn_detail5);
        btndetail6 = findViewById(R.id.btn_detail6);
        btndetail7 = findViewById(R.id.btn_detail7);
        btndetail8 = findViewById(R.id.btn_detail8);
        btndetail9 = findViewById(R.id.btn_detail9);
        btndetail10 = findViewById(R.id.btn_detail10);


        btndetail11 = findViewById(R.id.btn_detail11);
        btndetail12 = findViewById(R.id.btn_detail12);
        btndetail13 = findViewById(R.id.btn_detail13);
        btndetail14 = findViewById(R.id.btn_detail14);
        btndetail15 = findViewById(R.id.btn_detail15);
        btndetail16 = findViewById(R.id.btn_detail16);
        btndetail17 = findViewById(R.id.btn_detail17);
        btndetail18 = findViewById(R.id.btn_detail18);
        btndetail19 = findViewById(R.id.btn_detail19);
        btndetail20 = findViewById(R.id.btn_detail20);

        btndetail21 = findViewById(R.id.btn_detail21);
        btndetail22 = findViewById(R.id.btn_detail22);
        btndetail23 = findViewById(R.id.btn_detail23);




        btndetail1.setOnClickListener(this);
        btndetail2.setOnClickListener(this);
        btndetail3.setOnClickListener(this);
        btndetail4.setOnClickListener(this);
        btndetail5.setOnClickListener(this);
        btndetail6.setOnClickListener(this);
        btndetail7.setOnClickListener(this);
        btndetail8.setOnClickListener(this);
        btndetail9.setOnClickListener(this);
        btndetail10.setOnClickListener(this);
        btndetail11.setOnClickListener(this);
        btndetail12.setOnClickListener(this);
        btndetail13.setOnClickListener(this);
        btndetail14.setOnClickListener(this);
        btndetail15.setOnClickListener(this);
        btndetail16.setOnClickListener(this);
        btndetail17.setOnClickListener(this);
        btndetail18.setOnClickListener(this);
        btndetail19.setOnClickListener(this);
        btndetail20.setOnClickListener(this);

        btndetail21.setOnClickListener(this);
        btndetail22.setOnClickListener(this);
        btndetail23.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_detail1:
                Toast.makeText(this, "Daddy Little Girl", Toast.LENGTH_SHORT).show();
                Intent intentDaftarBuku = new Intent(this, Detail_DaddyLitteGirl.class);
                intentDaftarBuku.putExtra("KEY_TITLE", "Daddy Little Girl");
                startActivity(intentDaftarBuku);
                break;
            case R.id.btn_detail2:
                Toast.makeText(this, "Auguste Dupin", Toast.LENGTH_SHORT).show();
                Intent intentShopping = new Intent(this, Detail_Auguste.class);
                intentShopping.putExtra("KEY_TITLE", "Auguste Dupin");
                startActivity(intentShopping);
                break;

            case R.id.btn_detail3:
                Toast.makeText(this, "Harry Potter and the Half Blood Prince", Toast.LENGTH_SHORT).show();
                Intent intentHarry = new Intent(this, DetailHalfBlood.class);
                intentHarry.putExtra("KEY_TITLE", "Harry Potter and the Half Blood Prince");
                startActivity(intentHarry);
                break;

            case R.id.btn_detail4:
                Toast.makeText(this, "The Hobbit", Toast.LENGTH_SHORT).show();
                Intent intentHobbit = new Intent(this, DetailHobbit.class);
                intentHobbit.putExtra("KEY_TITLE", "The Hobbit");
                startActivity(intentHobbit);
                break;

            case R.id.btn_detail5:
                Toast.makeText(this, "Laskar Pelangi", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(this, DetailLaskarPelangi5.class);
                intent5.putExtra("KEY_TITLE", "Laskar Pelangi");
                startActivity(intent5);
                break;

            case R.id.btn_detail6:
                Toast.makeText(this, "The Pale House", Toast.LENGTH_SHORT).show();
                Intent intent6 = new Intent(this, DetailThePaleHouse6.class);
                intent6.putExtra("KEY_TITLE", "The Pale House");
                startActivity(intent6);
                break;

            case R.id.btn_detail7:
                Toast.makeText(this, "5 Hari Menguasai AS dan SQLite", Toast.LENGTH_SHORT).show();
                Intent intent7 = new Intent(this,DetailSQLite7.class);
                intent7.putExtra("KEY_TITLE", "5 Hari Menguasai AS dan SQLite");
                startActivity(intent7);
                break;

            case R.id.btn_detail8:
                Toast.makeText(this, "And Then There Were None", Toast.LENGTH_SHORT).show();
                Intent intent8 = new Intent(this, DetailAndThen8.class);
                intent8.putExtra("KEY_TITLE", "And Then There Were None");
                startActivity(intent8);
                break;


            case R.id.btn_detail9:
                Toast.makeText(this, "Nightmare Hour", Toast.LENGTH_SHORT).show();
                Intent intent9 = new Intent(this, DetailNightmareHour9.class);
                intent9.putExtra("KEY_TITLE", "Nightmare Hour");
                startActivity(intent9);
                break;


            case R.id.btn_detail10:
                Toast.makeText(this, "The Mystery of Yellow Room", Toast.LENGTH_SHORT).show();
                Intent intent10 = new Intent(this, DetailYellow10.class);
                intent10.putExtra("KEY_TITLE", "The Mystery of Yellow Room");
                startActivity(intent10);
                break;



            case R.id.btn_detail11:
                Toast.makeText(this, "The Haunted Mask", Toast.LENGTH_SHORT).show();
                Intent intent11 = new Intent(this, DetailHauntedMask11.class);
                intent11.putExtra("KEY_TITLE", "The Haunted Mask");
                startActivity(intent11);
                break;


            case R.id.btn_detail12:
                Toast.makeText(this, "Harry Potter and the Sorcerers Stone", Toast.LENGTH_SHORT).show();
                Intent intent12 = new Intent(this, DetailHarpotSorcerer12.class);
                intent12.putExtra("KEY_TITLE", "Harry Potter and the Sorcerers Stone");
                startActivity(intent12);
                break;


            case R.id.btn_detail13:
                Toast.makeText(this, "The Hunger Games", Toast.LENGTH_SHORT).show();
                Intent intent13 = new Intent(this, DetailHunger13.class);
                intent13.putExtra("KEY_TITLE", "The Hunger Games");
                startActivity(intent13);
                break;


            case R.id.btn_detail14:
                Toast.makeText(this, "Twilight", Toast.LENGTH_SHORT).show();
                Intent intent14 = new Intent(this, DetailTwilight14.class);
                intent14.putExtra("KEY_TITLE", "Twilight");
                startActivity(intent14);
                break;



            case R.id.btn_detail15:
                Toast.makeText(this, "Divergent", Toast.LENGTH_SHORT).show();
                Intent intent15 = new Intent(this, DetailDivergent15.class);
                intent15.putExtra("KEY_TITLE", "Divergent");
                startActivity(intent15);
                break;



            case R.id.btn_detail16:
                Toast.makeText(this, "The Fault in our Stars", Toast.LENGTH_SHORT).show();
                Intent intent16 = new Intent(this, DetailTheFault16.class);
                intent16.putExtra("KEY_TITLE", "The Fault in our Stars");
                startActivity(intent16);
                break;



            case R.id.btn_detail17:
                Toast.makeText(this, "The Maze Runner", Toast.LENGTH_SHORT).show();
                Intent intent17 = new Intent(this, DetailMaze17.class);
                intent17.putExtra("KEY_TITLE", "The Maze Runner");
                startActivity(intent17);
                break;


            case R.id.btn_detail18:
                Toast.makeText(this, "City of Bones", Toast.LENGTH_SHORT).show();
                Intent intent18 = new Intent(this, DetailBones18.class);
                intent18.putExtra("KEY_TITLE", "City of Bones");
                startActivity(intent18);
                break;


            case R.id.btn_detail19:
                Toast.makeText(this, "Negeri 5 Menara", Toast.LENGTH_SHORT).show();
                Intent intent19 = new Intent(this, DetailMenara19.class);
                intent19.putExtra("KEY_TITLE", "Negeri 5 Menara");
                startActivity(intent19);
                break;


            case R.id.btn_detail20:
                Toast.makeText(this, "5 CM", Toast.LENGTH_SHORT).show();
                Intent intent20 = new Intent(this, Detail5CM20.class);
                intent20.putExtra("KEY_TITLE", "5 CM");
                startActivity(intent20);
                break;

            case R.id.btn_detail21:
                Toast.makeText(this, "Edensor", Toast.LENGTH_SHORT).show();
                Intent intent21 = new Intent(this, DetailEdensor21.class);
                intent21.putExtra("KEY_TITLE", "Edensor");
                startActivity(intent21);
                break;


            case R.id.btn_detail22:
                Toast.makeText(this, "Hafalan Shalat Delisa", Toast.LENGTH_SHORT).show();
                Intent intent22 = new Intent(this, DetailHafalan22.class);
                intent22.putExtra("KEY_TITLE", "Hafalan Shalat Delisa");
                startActivity(intent22);
                break;


            case R.id.btn_detail23:
                Toast.makeText(this, "Perahu Kertas", Toast.LENGTH_SHORT).show();
                Intent intent23 = new Intent(this, DetailPerahu23.class);
                intent23.putExtra("KEY_TITLE", "Perahu Kertas");
                startActivity(intent23);
                break;
        }
    }
}
