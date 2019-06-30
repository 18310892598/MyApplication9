package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.billy.cc.core.component.CC;

/**
 *  主要入口
 */
public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private AppCompatButton button,buttontwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.bt);
        button.setOnClickListener(this);
        buttontwo=findViewById(R.id.bt1);
        buttontwo.setOnClickListener(this);

    }

    /**
     * 跳转到loginmodle
     */
    public void gotoB(){
        String callId = CC.obtainBuilder("ComponentA")
                .setActionName("showActivity")
                .build()
                .callAsync();
    }

    public void gotoC(){
        String callId = CC.obtainBuilder("ComponentB")
                .setActionName("showActivityB")
                .build()
                .callAsync();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bt:
                gotoB();
                break;
            case R.id.bt1:
                gotoC();
                break;
                default:
                    break;

        }
    }
}
