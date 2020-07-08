package example.com.tugasakhir020irham011yuni;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SQLiteMain extends AppCompatActivity {



    private EditText NIM, Nama, TanggalLahir, Alamat;
    private Spinner Jurusan;
    private RadioButton MALE, FAMALE;

    //Variable Untuk Menyimpan Input Dari Ueer
    private String setNIM, setNama, setTanggalLahir, setAlamat, setJurusan, setJenisKelamin;

    //Variable Untuk Inisialisasi Database DBMahasiswa
    private DBMahasiswa dbMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_main);
        //InnerClass dbMahasiswa = new InnerClass(getBaseContext());
        //Toast.makeText(getApplication(), dbMahasiswa.getDatabaseName(), Toast.LENGTH_SHORT).show();

        Button simpan = findViewById(R.id.save);
        NIM = findViewById(R.id.nim);
        Nama = findViewById(R.id.nama);
        TanggalLahir = findViewById(R.id.date);
        MALE = findViewById(R.id.male);
        FAMALE = findViewById(R.id.famale);
        Jurusan = findViewById(R.id.jurusan);
        Alamat = findViewById(R.id.alamat);

        //Inisialisasi dan Mendapatkan Konteks dari DBMahasiswa
        //dbMahasiswa = new InnerClass(getBaseContext());

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setData();
                saveData();
                Toast.makeText(getApplicationContext(),"Data Berhasil Disimpan", Toast.LENGTH_SHORT).show();
                clearData();
            }
        });
    }

    //Berisi Statement-Statement Untuk Mendapatkan Input Dari User
    private void setData(){
        setNIM = NIM.getText().toString();
        setNama = Nama.getText().toString();
        setJurusan = Jurusan.getSelectedItem().toString();
        if(MALE.isChecked()){
            setJenisKelamin = MALE.getText().toString();
        }else if (FAMALE.isChecked()){
            setJenisKelamin = FAMALE.getText().toString();
        }
        setTanggalLahir = TanggalLahir.getText().toString();
        setAlamat = Alamat.getText().toString();
    }

    //Berisi Statement-Statement Untuk Menyimpan Data Pada Database
    private void saveData(){
        //Mendapatkan Repository dengan Mode Menulis
        SQLiteDatabase create = dbMahasiswa.getWritableDatabase();

        //Membuat Map Baru, Yang Berisi Nama Kolom dan Data Yang Ingin Dimasukan
        ContentValues values = new ContentValues();
        values.put(InnerClass.MyColumns.NIM, setNIM);
        values.put(InnerClass.MyColumns.Nama, setNama);
        values.put(InnerClass.MyColumns.Jurusan, setJurusan);
        values.put(InnerClass.MyColumns.JenisKelamin, setJenisKelamin);
        values.put(InnerClass.MyColumns.TanggalLahir, setTanggalLahir);
        values.put(InnerClass.MyColumns.Alamat, setAlamat);

        //Menambahkan Baris Baru, Berupa Data Yang Sudah Diinputkan pada Kolom didalam Database
        create.insert(InnerClass.MyColumns.NamaTabel, null, values);
    }

    private void clearData(){
        NIM.setText("");
        Nama.setText("");
        TanggalLahir.setText("");
        Alamat.setText("");
    }

}
