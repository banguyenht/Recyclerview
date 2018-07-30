package com.example.ba.recyclerview;

public class ItemArtist {
    private int mAvatar;
    private String mName;

    public ItemArtist(int mAvatar, String mName) {

        this.mAvatar = mAvatar;
        this.mName = mName;
    }

    public ItemArtist() {
    }

    public int getmAvatar() {
        return mAvatar;
    }

    public void setmAvatar(int mAvatar) {
        this.mAvatar = mAvatar;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
