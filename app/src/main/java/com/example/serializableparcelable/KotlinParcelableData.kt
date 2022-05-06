package com.example.serializableparcelable

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable
import java.util.ArrayList

//Example of kotlin parcelable
@Parcelize
class KotlinParcelableData(
    var str1: String,
    var str2: String,
    var str3: String,
    var str4: String,
    var str5: String,
    var list: ArrayList<Int>
) : Parcelable