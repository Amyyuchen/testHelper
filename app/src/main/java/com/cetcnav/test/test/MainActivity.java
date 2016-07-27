package com.cetcnav.test.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cetcnav.test.test.domain.contast.UrlUtil;
import com.cetcnav.test.test.domain.http.api.IDCardClient;
import com.cetcnav.test.test.domain.http.request.IDCardRequest;
import com.cetcnav.test.test.domain.http.response.IDCardResponse;
import com.cetcnav.test.test.domain.model.RetDataBean;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {


    Call<IDCardResponse> cardResponseCallback;
    @Bind(R.id.et_idCard)
    EditText etIdCard;
    @Bind(R.id.onClick)
    Button onClick;
    @Bind(R.id.result)
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.onClick)
    public void onClick() {
        String idCard = etIdCard.getText().toString();
        if (idCard != null) {
            IDCardRequest idCardRequest = new IDCardRequest();
            idCardRequest.setApiKey(UrlUtil.API_KEY);
            idCardRequest.setID(idCard);

            cardResponseCallback = new IDCardClient().getId(idCardRequest);
            cardResponseCallback.enqueue(new Callback<IDCardResponse>() {
                @Override
                public void onResponse(Call<IDCardResponse> call, Response<IDCardResponse> response) {
                    if (response.isSuccessful()) {
                        IDCardResponse idCardResponse = response.body();
                        if (idCardResponse != null) {
                            String sex = "";
                            RetDataBean retDataBean = idCardResponse.getRetData();
                            if (retDataBean.getSex().equals("M")){
                                sex = "男";
                            } else {
                                sex = "女";
                            }
                            result.setText("生日:" + retDataBean.getBirthday() + "性别:" + sex + "地址：" + retDataBean.getAddress());
                        }
                    }
                }

                @Override
                public void onFailure(Call<IDCardResponse> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "请输入正确的身份证", Toast.LENGTH_SHORT).show();
                }
            });

        }


    }
}
