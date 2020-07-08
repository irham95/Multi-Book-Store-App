package example.com.tugasakhir020irham011yuni;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/**
 * Written by Irham Nurrahman on 1:39 PM 4/10/2020
 **/

public class ViewPageAdapter extends PagerAdapter {

    Context context;

    int[] flag;
    String[] judul;
    String[] keterangan;
    LayoutInflater inflater;

    public ViewPageAdapter(Context context, String[] judul, String[] keterangan, int[] flag) {
        this.context = context;
        this.judul = judul;
        this.keterangan = keterangan;
        this.flag = flag;

    }

    @Override
    public int getCount() {
        return flag.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ScrollView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView teksJudul;
        TextView teksKeterangan;

        ImageView imgflag;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.galeri_item, container, false);


        teksJudul = (TextView) itemView.findViewById(R.id.textView);
        teksKeterangan = (TextView) itemView.findViewById(R.id.textView2);
        teksJudul.setText(judul[position]);
        teksKeterangan.setText(keterangan[position]);

        imgflag = (ImageView) itemView.findViewById(R.id.imgItem);
        imgflag.setImageResource(flag[position]);

        ((ViewPager) container).addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ScrollView) object);
    }
}
