package com.example.doit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameActivity extends AppCompatActivity {

    private Button btn_change_img;
    private ImageView img_1, img_2;
    private int image_index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        btn_change_img = findViewById(R.id.btn_change_img);
        img_1 = findViewById(R.id.img_1);   // setvisibility를 이용하기 때문에, 이미지들도 xml파일과 연동을 시켜줘야된다.
        img_2 = findViewById(R.id.img_2);

        btn_change_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeImage();
            }
        });

    }


    private void changeImage() {
        if (image_index == 0) {
            img_1.setVisibility(View.VISIBLE);
            img_2.setVisibility(View.INVISIBLE);

            image_index = 1;
        } else if (image_index == 1) {
            img_1.setVisibility(View.INVISIBLE);
            img_2.setVisibility(View.VISIBLE);

            image_index = 0;
        }

    }

}