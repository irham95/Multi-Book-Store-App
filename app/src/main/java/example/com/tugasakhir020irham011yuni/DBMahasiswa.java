package example.com.tugasakhir020irham011yuni;

/**
 * Written by Irham Nurrahman on 7:14 PM 4/12/2020
 **/

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DBMahasiswa extends SQLiteOpenHelper{

    private static final String namadatabase = "unpi.db";
    private static final int VersiDatabase = 1;

    public DBMahasiswa(Context context) {
        super(context, namadatabase, null, VersiDatabase);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}

