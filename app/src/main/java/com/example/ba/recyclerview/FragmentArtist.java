package com.example.ba.recyclerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FragmentArtist extends Fragment implements ArtistAdapter.ItemArtistLisener{
    private List<ItemArtist> mList_Artist;
    private RecyclerView mRecyclerView;
    private ArtistAdapter mAdapter;
    private ISwitchFragment mInter;

    public void setmInter(ISwitchFragment mInter) {
        this.mInter = mInter;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =LayoutInflater.from(getContext()).
                inflate(R.layout.fragment_layout,container,false);
        initView(view);
        initData();
        return view;
    }
    public void initView(View view){
        mRecyclerView=view.findViewById(R.id.rc_listartist);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mAdapter=new ArtistAdapter(this);
        mAdapter.notifyDataSetChanged();
        mRecyclerView.setAdapter(mAdapter);
    }
    public void initData(){
        mList_Artist=new ArrayList<>();
        mList_Artist.
                add(new ItemArtist(R.drawable.avatar_charlie,getString(R.string.name_charlie)));
        mList_Artist.
                add(new ItemArtist(R.drawable.avatar_chidan,getString(R.string.name_chidan)));
        mList_Artist.
                add(new ItemArtist(R.drawable.avatar_thuychi,getString(R.string.name_thuychi)));
        mList_Artist.
                add(new ItemArtist(R.drawable.avatar_selena,getString(R.string.name_selena)));
        mList_Artist.
                add(new ItemArtist(R.drawable.avatar_mrdam,getString(R.string.name_mrdam)));
        mList_Artist.
                add(new ItemArtist(R.drawable.avatar_haho,getString(R.string.name_haho)));
        mList_Artist.
                add(new ItemArtist(R.drawable.avatar_charlie,getString(R.string.name_charlie)));
        mList_Artist.
                add(new ItemArtist(R.drawable.avatar_yeon,getString(R.string.name_yeon)));
        mList_Artist.
                add(new ItemArtist(R.drawable.avatar_hoavinh,getString(R.string.name_hoavinh)));
        ;
        mList_Artist.
                add(new ItemArtist(R.drawable.avatar_noo,getString(R.string.name_noo)));
    }


    @Override
    public void onClickItem(int position) {
//        Toast.makeText(this.getContext(), ""+mList_Artist.get(position).getmName(), Toast.LENGTH_SHORT).show();

        mInter.switchfragment(mList_Artist.get(position));
    }

    @Override
    public int getCount() {
        return mList_Artist.size();
    }

    @Override
    public ItemArtist getItem(int position) {
        return mList_Artist.get(position);
    }
    public interface ISwitchFragment{
        void switchfragment(ItemArtist item);

    }


}
