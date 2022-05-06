package com.example.serializableparcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class SerializableData implements Serializable {

    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    ArrayList<Integer> list;





    public SerializableData(String str1, String str2, String str3, String str4, String str5,ArrayList<Integer> list) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
        this.str4 = str4;
        this.str5 = str5;
        this.list = list;
    }

}
