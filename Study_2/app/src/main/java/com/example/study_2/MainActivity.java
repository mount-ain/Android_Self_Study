package com.example.study_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private View drawerView;
    private Button btn_menu, btn_menu_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerView = (View) findViewById(R.id.drawer_view);
        btn_menu = findViewById(R.id.btn_menu);
        btn_menu_close = findViewById(R.id.btn_menu_close);

        btn_menu.setOnClickListener(new View.OnClickListener() {   // menu 버튼 클릭 시 drawerview 출력
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        btn_menu_close.setOnClickListener(new View.OnClickListener() {   // close 버튼 클릭 시
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawers();   // ** close Drawer (x), close Drawers (o) s붙은 drawer로 입력해줘야됨
            }
        });

        drawerLayout.setDrawerListener(listner);
        drawerView.setOnTouchListener(new View.OnTouchListener() {   //
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    DrawerLayout.DrawerListener listner = new DrawerLayout.DrawerListener() {   // listner 인스턴스 생성 *listner 인스턴스는 drawerlayout의 상태 변화에 따른 코딩
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };

}