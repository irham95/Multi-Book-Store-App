package example.com.tugasakhir020irham011yuni;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
/**
 * Written by Irham Nurrahman on 5:55 AM 4/6/2020
 **/
public class ImageAdapter extends BaseAdapter  {

    private Context mContext;

    public ImageAdapter(Context c)
    {
        mContext = c;
    }

    public static Integer[] mThumbIds =
            {
                    //Gambar-gambar yang ada disimpan dalam array

                    R.drawable.sample_0, R.drawable.sample_1,
                    R.drawable.sample_2, R.drawable.sample_3,
                    R.drawable.sample_4, R.drawable.sample_5,
                    R.drawable.sample_6, R.drawable.sample_7,
                    R.drawable.sample_8, R.drawable.sample_9,
                    R.drawable.sample_10, R.drawable.sample_11,
                    R.drawable.sample_12, R.drawable.sample_13,
                    R.drawable.sample_14, R.drawable.sample_15,
                    R.drawable.sample_16, R.drawable.sample_17,
                    R.drawable.sample_18, R.drawable.sample_19,
                    R.drawable.sample_20, R.drawable.sample_21,
                    R.drawable.sample_22, R.drawable.sample_5,
                    R.drawable.sample_4, R.drawable.sample_3,
                    R.drawable.sample_2, R.drawable.sample_1,
                    R.drawable.sample_0, R.drawable.sample_9,
                    R.drawable.sample_8, R.drawable.sample_7,
                    R.drawable.sample_6, R.drawable.sample_22,
                    R.drawable.sample_21, R.drawable.sample_20,
                    R.drawable.sample_19, R.drawable.sample_18,
                    R.drawable.sample_17, R.drawable.sample_15,
                    R.drawable.sample_16, R.drawable.sample_13,
                    R.drawable.sample_14, R.drawable.sample_12,
                    R.drawable.sample_11, R.drawable.sample_10,
                    R.drawable.sample_0, R.drawable.sample_1,
                    R.drawable.sample_2, R.drawable.sample_3,
                    R.drawable.sample_4, R.drawable.sample_5,
                    R.drawable.sample_6, R.drawable.sample_7,
                    R.drawable.sample_21, R.drawable.sample_16,
                    R.drawable.sample_14, R.drawable.sample_5,
                    R.drawable.sample_6, R.drawable.sample_3,
                    R.drawable.sample_2, R.drawable.sample_11,
                    R.drawable.sample_12, R.drawable.sample_14,
                    R.drawable.sample_6, R.drawable.sample_1,
                    R.drawable.sample_13, R.drawable.sample_14,
                    R.drawable.sample_17
            };

    @Override
    public int getCount() {
        // Jumlah total gambar
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Mengambil satu gambar dari gallery
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
}
