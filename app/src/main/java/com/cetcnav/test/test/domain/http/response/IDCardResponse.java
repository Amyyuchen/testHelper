package com.cetcnav.test.test.domain.http.response;

import com.cetcnav.test.test.domain.model.RetDataBean;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

public class IDCardResponse extends Response{
    /**
     * address : 河北省石家庄市桥西区
     * sex : M
     * birthday : 1995-02-18
     */
    @Getter
    @Expose
    @SerializedName("retData")
    private RetDataBean retData;
}
