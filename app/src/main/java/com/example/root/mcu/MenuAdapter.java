package com.example.root.mcu;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by root on 12/17/16.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {

    private Context mContext;
    private List<MenuProperties> sourcesList;
    int pos;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,article;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView)view.findViewById(R.id.card_model_header);
            article = (TextView)view.findViewById(R.id.articleTitle);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);

            title.setTypeface(Typeface.createFromAsset(mContext.getAssets(),"fonts/latobold.ttf"));
            article.setTypeface(Typeface.createFromAsset(mContext.getAssets(),"fonts/latobold.ttf"));
        }

    }


    public MenuAdapter(Context mContext, List<MenuProperties> sourcesList) {
        this.mContext = mContext;
        this.sourcesList = sourcesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        final MenuProperties sources = sourcesList.get(position);

        holder.title.setText(sources.getTitle());
        holder.article.setText(sources.getArticle());
        Glide.with(mContext).load(sources.getThumbnail()).into(holder.thumbnail);
        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(holder.getAdapterPosition()){
                    case 0: //point to point
                        break;
                    case 1: //building history
                        Intent bh = new Intent(mContext,BuildingHistory.class);
                        bh.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(bh);
                        break;
                    case 2: //overview of mcu
                        Intent overview = new Intent(mContext,Overview.class);
                        overview.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(overview);
                        break;
                    case 3: //about author
                        Intent about = new Intent(mContext,AboutAuthor.class);
                        about.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(about);
                        break;
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return sourcesList.size();
    }
}
