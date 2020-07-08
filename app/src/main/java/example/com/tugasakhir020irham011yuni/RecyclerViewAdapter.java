package example.com.tugasakhir020irham011yuni;

/**
 * Written by Irham Nurrahman on 10:15 PM 4/12/2020
 **/

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//Class Adapter ini Digunakan Untuk Mengatur Bagaimana Data akan Ditampilkan
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList namaList; //Digunakan untuk Nama
    private ArrayList jurusanList; //Digunakan untuk Jurusan
    private ArrayList nimList; //Digunakan untuk Jurusan

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerViewAdapter(ArrayList namaList, ArrayList jurusanList, ArrayList nimList){
        this.namaList = namaList;
        this.jurusanList = jurusanList;
        this.nimList = nimList;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView Nama, Jurusan, Nim;

        ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Nama = itemView.findViewById(R.id.name);
            Jurusan = itemView.findViewById(R.id.jurusan);
            Nim = itemView.findViewById(R.id.NIM);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_design, parent, false);
        return new ViewHolder(V);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String Nama = (String) namaList.get(position);//Mengambil data (Nama) sesuai dengan posisi yang telah ditentukan
        final String Jurusan = (String) jurusanList.get(position);//Mengambil data (Jurusan) sesuai dengan posisi yang telah ditentukan
        final String NIM = (String) nimList.get(position);//Mengambil data (NIM) sesuai dengan posisi yang telah ditentukan
        holder.Nama.setText(Nama);
        holder.Jurusan.setText(Jurusan);
        holder.Nim.setText(NIM);
    }

    @Override
    public int getItemCount() {
        //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
        return nimList.size();
    }

}
