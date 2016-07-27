package com.cetcnav.test.test.domain.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;


/**
 * Created by 邢皓翔 on 2016/7/14.
 */
@Data
public class RetDataBean implements Parcelable {
    @Expose
    @SerializedName("address")
    private String address;
    @Expose
    @SerializedName("sex")
    private String sex;
    @Expose
    @SerializedName("birthday")
    private String birthday;


    protected RetDataBean(Parcel in) {
        address = in.readString();
        sex = in.readString();
        birthday = in.readString();
    }

    public static final Creator<RetDataBean> CREATOR = new Creator<RetDataBean>() {
        @Override
        public RetDataBean createFromParcel(Parcel in) {
            return new RetDataBean(in);
        }

        @Override
        public RetDataBean[] newArray(int size) {
            return new RetDataBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(address);
        dest.writeString(sex);
        dest.writeString(birthday);
    }
}
