package com.example.ba.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder> {
    private ItemArtistLisener mInter;

    public ArtistAdapter(ItemArtistLisener mInter) {
        this.mInter = mInter;
    }

    @NonNull
    @Override
    public ArtistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ArtistViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.itemview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistViewHolder holder, final int position) {
        ItemArtist item = mInter.getItem(position);
        holder.mTvName.setText(item.getmName());
        holder.mImgAvatar.setImageResource(item.getmAvatar());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInter.onClickItem(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mInter.getCount();
    }

    public class ArtistViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImgAvatar;
        private TextView mTvName;

        public ArtistViewHolder(@NonNull View itemView) {
            super(itemView);
            mImgAvatar = itemView.findViewById(R.id.image_avatar);
            mTvName = itemView.findViewById(R.id.textview_name);
        }
    }

    public interface ItemArtistLisener {
        void onClickItem(int position);

        int getCount();

        ItemArtist getItem(int position);
    }
}
