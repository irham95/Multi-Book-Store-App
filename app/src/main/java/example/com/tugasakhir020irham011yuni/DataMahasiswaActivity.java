package example.com.tugasakhir020irham011yuni;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import example.com.tugasakhir020irham011yuni.adapter.ListMhsAdapter;
import example.com.tugasakhir020irham011yuni.model.Mahasiswa;

public class DataMahasiswaActivity extends AppCompatActivity {
    private RecyclerView rvMahasiswa;
    private final ArrayList<Mahasiswa> listMhs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);


        String title =
                getIntent().getStringExtra("TITLE_NAME");
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setHasFixedSize(true);

        listMhs.addAll(getListMahasiswa());
        showList();
    }

    private void showList() {
        rvMahasiswa.setLayoutManager(new
                LinearLayoutManager(this));
        ListMhsAdapter listMhsAdapter = new
                ListMhsAdapter(listMhs);
        rvMahasiswa.setAdapter(listMhsAdapter);

        listMhsAdapter.setOnItemClickCallback(new ListMhsAdapter.OnItemClickCallback() {

            @Override
            public void onItemClicked(Mahasiswa data) {
                Toast.makeText(DataMahasiswaActivity.this, "Buku " +
                        data.getName(), Toast.LENGTH_SHORT).show(); Intent intent = new
                        Intent(DataMahasiswaActivity.this, DetailActivity.class); intent.putExtra("NAME", data.getName()); intent.putExtra("DESC",
                        data.getDescription());
                        intent.putExtra("PHOTO", data.getPhoto());
                        startActivity(intent);
            }
        });
    }

    private ArrayList<Mahasiswa> getListMahasiswa() { String[] dataName =
            getResources().getStringArray(R.array.data_name_mhs);
        String[] dataDesc =
                getResources().getStringArray(R.array.data_description);
        TypedArray dataPhoto =


                getResources().obtainTypedArray(R.array.data_foto_mhs);

        ArrayList<Mahasiswa> listMhs = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) { Mahasiswa mhs = new Mahasiswa(); mhs.setName(dataName[i]); mhs.setDescription(dataDesc[i]); mhs.setPhoto(dataPhoto.getResourceId(i, 0));
//	cara setnya kalo lewat java
//mhs.setPhoto(image_ids[i]);
            listMhs.add(mhs);
        } dataPhoto.recycle(); return listMhs;
    }
    // kalo semisalnya mau di set dari javanya
    private final Integer[] data_foto_mhs = {
            R.drawable.sample_0, R.drawable.sample_1, R.drawable.sample_3, R.drawable.sample_4,
            R.drawable.sample_5, R.drawable.sample_6, R.drawable.sample_7, R.drawable.sample_8,

            R.drawable.sample_9, R.drawable.sample_10, R.drawable.sample_11, R.drawable.sample_12,
            R.drawable.sample_13, R.drawable.sample_14, R.drawable.sample_15, R.drawable.sample_16,

            R.drawable.sample_17, R.drawable.sample_18, R.drawable.sample_19, R.drawable.sample_20,
            R.drawable.sample_21, R.drawable.sample_22
    };
}


