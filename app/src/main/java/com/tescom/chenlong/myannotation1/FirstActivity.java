package com.tescom.chenlong.myannotation1;

import android.view.View;
import android.widget.TextView;

import com.chenlong.findlayout.ClickView;
import com.chenlong.findlayout.InjectLayout;
import com.chenlong.findview.InjectView;

@InjectLayout(R.layout.activity_first)
public class FirstActivity extends BaseActivity {
    @InjectView(R.id.tv_show2)
    public TextView tv_show2;

    @Override
    protected void initSomething() {

    }

    @Override
    public void onClick(View v) {

    }
}
