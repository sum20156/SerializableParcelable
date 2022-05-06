package com.example.serializableparcelable;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class ParcelableData implements Parcelable {


    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    ArrayList<Integer> list;

    public ParcelableData(String str1, String str2, String str3, String str4, String str5, ArrayList<Integer> list) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
        this.str4 = str4;
        this.str5 = str5;
        this.list = list;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.str1);
        dest.writeString(this.str2);
        dest.writeString(this.str3);
        dest.writeString(this.str4);
        dest.writeString(this.str5);
        dest.writeList(this.list);
    }

    public void readFromParcel(Parcel source) {
        this.str1 = source.readString();
        this.str2 = source.readString();
        this.str3 = source.readString();
        this.str4 = source.readString();
        this.str5 = source.readString();
        this.list = new ArrayList<Integer>();
        source.readList(this.list, Integer.class.getClassLoader());
    }

    public ParcelableData() {
    }

    protected ParcelableData(Parcel in) {
        this.str1 = in.readString();
        this.str2 = in.readString();
        this.str3 = in.readString();
        this.str4 = in.readString();
        this.str5 = in.readString();
        this.list = new ArrayList<Integer>();
        in.readList(this.list, Integer.class.getClassLoader());
    }

    public static final Creator<ParcelableData> CREATOR = new Creator<ParcelableData>() {
        @Override
        public ParcelableData createFromParcel(Parcel source) {
            return new ParcelableData(source);
        }

        @Override
        public ParcelableData[] newArray(int size) {
            return new ParcelableData[size];
        }
    };
}
