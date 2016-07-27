package com.cetcnav.test.test.domain.http.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Created by 邢皓翔 on 2016/7/25.
 */
@Data
public class Response {
    @Expose
    @SerializedName("errNum")
    private int errNum;
    @Expose
    @SerializedName("retMsg")
    private String retMsg;
}
