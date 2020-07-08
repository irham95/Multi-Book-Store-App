package example.com.tugasakhir020irham011yuni;

/**
 * Written by Irham Nurrahman on 7:22 AM 4/6/2020
 **/
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class BooksAdapter extends BaseAdapter {

    private final Context mContext;
    private final DaftarBuku[] books;

    // 1
    public BooksAdapter(Context context, DaftarBuku[] books) {
        this.mContext = context;
        this.books = books;
    }

    // 2
    @Override
    public int getCount() {
        return books.length;
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText(String.valueOf(position));
        return dummyTextView;
    }

}
