package example.com.tugasakhir020irham011yuni;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 * Written by Irham Nurrahman on 9:55 AM 4/6/2020
 **/
public class CardViewHeroAdapter extends RecyclerView.Adapter<CardViewHeroAdapter.CardViewViewHolder> {
    private ArrayList<Hero> listHero;
    private Context context;
    private Activity activity;
    private Hero Hero;

    public CardViewHeroAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Hero> getListHero(ArrayList<Hero> list) {
        return listHero;
    }

    public CardViewHeroAdapter(ArrayList<Hero> list) { this.listHero = list; }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_hero, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        final Hero hero = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(hero.getName());
        holder.tvDetail.setText(hero.getDetail());
        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Favorit " +
                        listHero.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
       holder.btnShare.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View v) {
             Toast.makeText(holder.itemView.getContext(), "Cek Buku ini di Katalog Belanja ", Toast.LENGTH_SHORT).show();
           }
       });
        //baru
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listHero.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            }
            //baru
        });
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnFavorite, btnShare;
        Hero hero;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorit);
            btnShare = itemView.findViewById(R.id.btn_set_beli);
            btnShare.setOnClickListener(this);


        }

        @Override
        //public void onClick(View view) {
           // Intent intent = new Intent(context, TentangKami.class);
            //intent.putExtra("key", (Parcelable) hero);
            //context.startActivity(intent);

        public void onClick(View view) {
        Intent intent = new Intent(context, TentangKami.class);
        intent.putExtra("key", String.valueOf(hero));
        }
    }

}
