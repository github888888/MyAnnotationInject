package com.tescomm.chenlong.myannotation2;

import android.widget.TextView;

import com.chenlong.findlayout.InjectLayout;
import com.chenlong.findview.InjectView;
import com.tescom.chenlong.myannotation1.BaseActivity;
import com.tescom.chenlong.myannotation1.R;

@InjectLayout(R.layout.activity_second)
public class SecondActivity extends BaseActivity {
    @InjectView(R.id.tv_show3)
    public TextView tv_show3;

    @Override
    protected void initSomething() {

    }

}
