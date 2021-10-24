package com.example.kidoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View v)
    {
        findViewById(R.id.logo).setVisibility(View.INVISIBLE);
        findViewById(R.id.frame).setVisibility(View.VISIBLE);
    }
    public void next(View v)
    {
        ImageView iv=findViewById(R.id.frame);
        count++;
        switch(count) {
            case 0:
                iv.setImageResource(R.drawable.a);
                break;
            case 1:
                iv.setImageResource(R.drawable.b);
                break;
            case 2:
                iv.setImageResource(R.drawable.c);
                break;
            case 3:
                iv.setImageResource(R.drawable.d);
                break;
            case 4:
                iv.setImageResource(R.drawable.e);
                break; case 5:
                iv.setImageResource(R.drawable.f);
                break;case 6:
                iv.setImageResource(R.drawable.g);
                break;case 7:
                iv.setImageResource(R.drawable.h);
                break;case 8:
                iv.setImageResource(R.drawable.i);
                break;case 9:
                iv.setImageResource(R.drawable.j);
                break;case 10:
                iv.setImageResource(R.drawable.k);
                break;case 11:
                iv.setImageResource(R.drawable.l);
                break;case 12:
                iv.setImageResource(R.drawable.m);
                break;case 13:
                iv.setImageResource(R.drawable.n);
                break;case 14:
                iv.setImageResource(R.drawable.o);
                break;case 15:
                iv.setImageResource(R.drawable.p);
                break;case 16:
                iv.setImageResource(R.drawable.q);
                break;case 17:
                iv.setImageResource(R.drawable.r);
                break;case 18:
                iv.setImageResource(R.drawable.s);
                break;case 19:
                iv.setImageResource(R.drawable.t);
                break;case 20:
                iv.setImageResource(R.drawable.u);
                break;case 21:
                iv.setImageResource(R.drawable.v);
                break;case 22:
                iv.setImageResource(R.drawable.w);
                break;case 23:
                iv.setImageResource(R.drawable.x);
                break;case 24:
                iv.setImageResource(R.drawable.y);
                break;case 25:
                iv.setImageResource(R.drawable.z);
                break;
            default: {
                iv.setVisibility(View.INVISIBLE);
                findViewById(R.id.logo).setVisibility(View.VISIBLE);
                count = -1;
            }

        }
    }
}