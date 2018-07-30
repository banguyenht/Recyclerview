package com.example.ba.recyclerview;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements FragmentArtist.ISwitchFragment{
    private FragmentArtist mFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        initView();
    }

    private void initView() {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        mFragment=new FragmentArtist();
        mFragment.setmInter(this);
        transaction.add(R.id.frame_container,mFragment,FragmentArtist.class.getSimpleName());
        transaction.commit();

    }

    @Override
    public void switchfragment( ItemArtist item) {
        Toast.makeText(this,""+item.getmName(),Toast.LENGTH_LONG).show();

    }
}
