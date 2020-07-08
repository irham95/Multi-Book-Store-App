package example.com.tugasakhir020irham011yuni;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewData extends AppCompatActivity {
    private DBMahasiswa MyDatabase;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList NamaList;
    private ArrayList JurusanList;
    private ArrayList NIMList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);
        getSupportActionBar().setTitle("Daftar Mahasiswa");
        NamaList = new ArrayList<>();
        JurusanList = new ArrayList<>();
        NIMList = new ArrayList<>();
        MyDatabase = new DBMahasiswa(getBaseContext());
        recyclerView = findViewById(R.id.recycler);
        getData();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(NamaList, JurusanList, NIMList);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
        //Membuat Underline pada Setiap Item Didalam List
        DividerItemDecoration itemDecoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.line));
        recyclerView.addItemDecoration(itemDecoration);
    }

    //Berisi Statement-Statement Untuk Mengambi Data dari Database
    @SuppressLint("Recycle")
    protected void getData(){
        //Mengambil Repository dengan Mode Membaca
        SQLiteDatabase ReadData = MyDatabase.getReadableDatabase();
        Cursor cursor = ReadData.rawQuery("SELECT * FROM "+ InnerClass.MyColumns.NamaTabel,null);

        cursor.moveToFirst();//Memulai Cursor pada Posisi Awal

        //Melooping Sesuai Dengan Jumlan Data (Count) pada cursor
        for(int count=0; count < cursor.getCount(); count++){

            cursor.moveToPosition(count);//Berpindah Posisi dari no index 0 hingga no index terakhir

            NIMList.add(cursor.getString(0));//Menambil Data Dari Kolom 0 (NIM)
            NamaList.add(cursor.getString(1));//Menambil Data Dari Kolom 1 (Nama)
            JurusanList.add(cursor.getString(2));//Menambil Data Dari Kolom 2 (Jurusan)
        }
    }
}
