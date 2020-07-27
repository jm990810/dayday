
package com.example.dayday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import petrov.kristiyan.colorpicker.ColorPicker;

public class MainActivity extends AppCompatActivity {
    private Button button, but1, but2, but3, but4, col_change;
    private LinearLayout layout1, layout2, layout3;
    private TextView top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base);

        top = (TextView)findViewById(R.id.top_text);
        button = (Button) findViewById(R.id.change);
        but1 = (Button)findViewById(R.id.but1);
        but2 = (Button)findViewById(R.id.but2);
        but3 = (Button)findViewById(R.id.but3);
        but4 = (Button)findViewById(R.id.but4);
        col_change = (Button)findViewById(R.id.change);
        layout1 = (LinearLayout) findViewById(R.id.top);
        layout2 = (LinearLayout) findViewById(R.id.middle);
        layout3 = (LinearLayout) findViewById(R.id.bottom);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openColorPicker();
            }
        });
    }

    public void openColorPicker() {
        final ColorPicker colorPicker = new ColorPicker(this);  // ColorPicker 객체 생성
        ArrayList<String> colors = new ArrayList<>();  // Color 넣어줄 list

        colors.add("#FFffab91");
        colors.add("#FFF48FB1");
        colors.add("#FFce93d8");
        colors.add("#FFb39ddb");
        colors.add("#FF9fa8da");
        colors.add("#FF90caf9");
        colors.add("#FF81d4fa");
        colors.add("#FF80deea");
        colors.add("#FF80cbc4");
        colors.add("#FFc5e1a5");
        colors.add("#FFe6ee9c");
        colors.add("#FFfff59d");
        colors.add("#FFffe082");
        colors.add("#FFffcc80");
        colors.add("#FFbcaaa4");

        colorPicker.setColors(colors)
                .setColumns(5)
                .setRoundColorButton(true)  // 원형 버튼으로 설정
                .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        layout1.setBackgroundColor(color);
                        // OK 버튼 클릭 시 이벤트

                        but1.setBackgroundColor(color);
                        but1.setAlpha(0.66f);
                        but2.setBackgroundColor(color);
                        but2.setAlpha(0.75f);
                        but3.setBackgroundColor(color);
                        but3.setAlpha(0.84f);
                        but4.setBackgroundColor(color);
                        but4.setAlpha(0.93f);
                        col_change.setBackgroundColor(color);
                        col_change.setAlpha(0.5f);

                    }

                    @Override
                    public void onCancel() {
                        // Cancel 버튼 클릭 시 이벤트
                    }
                }).show();  // dialog 생성
    }
}