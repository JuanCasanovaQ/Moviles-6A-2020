package com.example.palletecolors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    private SeekBar sbr_Red = null;
    private SeekBar sbr_Green = null;
    private SeekBar sbr_Blue = null;
    private SeekBar sbr_Alpha = null;
    private View vie_Colors = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbr_Red = findViewById(R.id.sbrRed);
        sbr_Green = findViewById(R.id.sbrGreen);
        sbr_Blue = findViewById(R.id.sbrBlue);
        sbr_Alpha = findViewById(R.id.sbrAlpha);
        vie_Colors = findViewById(R.id.viewColors);

        sbr_Red.setOnSeekBarChangeListener(this);
        sbr_Green.setOnSeekBarChangeListener(this);
        sbr_Blue.setOnSeekBarChangeListener(this);
        sbr_Alpha.setOnSeekBarChangeListener(this);
    }

    //Show options menu
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //Actions options menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            /*
            case R.id.iteSearch:
                //Toast.makeText(this, "You've pressed Search of option", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, AboutOfActivity.class);
                startActivity(intent);
                break;*/

            case R.id.iteAboutOf :
                //Toast.makeText(this, "You've pressed About of option", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, AboutOfActivity.class);
                startActivity(intent1);
                break;

            case R.id.iteHelp :
                Toast.makeText(this, "You've pressed Help option", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iteExit :
                Toast.makeText(this, "You've pressed E xit option", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iteReset :
                break;

            case R.id.iteTransparent :
                sbr_Alpha.setProgress(0);
                break;

            case R.id.iteSemiTransparent :
                sbr_Alpha.setProgress(128);
                break;

            case R.id.iteOpaque :
                sbr_Alpha.setProgress(255);
                break;

            case R.id.iteBlack :

                break;

            case R.id.iteWhite :
                break;

            case R.id.iteRed :
                break;

            case R.id.iteBlue :
                sbr_Red.setProgress(0);
                sbr_Green.setProgress(0);
                sbr_Blue.setProgress(255);
                break;

            case R.id.iteCyan :
                break;

            case R.id.iteMagenta :
                sbr_Red.setProgress(255);
                sbr_Green.setProgress(0);
                sbr_Blue.setProgress(255);
                break;

            case R.id.iteYellow :
                sbr_Red.setProgress(255);
                sbr_Green.setProgress(255);

                break;

            case R.id.iteGreen :
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bo) {
        int r = sbr_Red.getProgress();
        int g = sbr_Green.getProgress();
        int b = sbr_Blue.getProgress();
        int a = sbr_Alpha.getProgress();

        int color = Color.argb(a,r,g,b);
        vie_Colors.setBackgroundColor(color);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}