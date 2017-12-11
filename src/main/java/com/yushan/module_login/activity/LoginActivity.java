package com.yushan.module_login.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yushan.lib_base.base.BaseActivity;
import com.yushan.module_login.R;

@Route(path = "/module_login/LoginActivity")
public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.tv_name).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this,"click",Toast.LENGTH_SHORT).show();
                ARouter.getInstance().build("/module_compete/CompeteActivity").navigation();
            }
        });
    }
}
