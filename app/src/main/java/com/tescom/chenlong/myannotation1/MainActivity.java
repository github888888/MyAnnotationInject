package com.tescom.chenlong.myannotation1;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.chenlong.findlayout.ClickView;
import com.chenlong.findlayout.InjectLayout;
import com.chenlong.findview.InjectView;
import com.tescomm.chenlong.myannotation2.SecondActivity;

@InjectLayout(R.layout.activity_main)
public class MainActivity extends BaseActivity implements View.OnClickListener {
    @InjectView(R.id.tv_show)
    public TextView tv_show;

    @Override
    protected void initSomething() {
        tv_show.setText("success.....");
    }

    @Override
    @ClickView({R.id.tv_show})
    public void onClick(View v) {
        if (v == tv_show) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }
}
