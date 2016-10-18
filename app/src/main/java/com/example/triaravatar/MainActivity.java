package com.example.triaravatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button endavant, endarrere;
    ImageView avatar;

    private Integer avatars[] = {R.drawable.avatar1, R.drawable.avatar2, R.drawable.avatar3, R.drawable.avatar4};
    int imatgeActual = 0   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        endavant = (Button) findViewById(R.id.endavant);
        endarrere = (Button)findViewById(R.id.endarrere);
        endavant.setOnClickListener(this);
        endarrere.setOnClickListener(this);
        avatar = (ImageView) findViewById(R.id.avatar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.endavant:
             if (imatgeActual<avatars.length-1) {
                 imatgeActual=imatgeActual+1;
                 avatar.setImageResource(avatars[imatgeActual]);
             }
             else {
                 imatgeActual=0;
                 avatar.setImageResource(avatars[imatgeActual]);
             }
            break;

            case R.id.endarrere:
              if (imatgeActual==0) {
                  imatgeActual = avatars.length-1;
                  avatar.setImageResource(avatars[imatgeActual]);

              }
              else {
                  imatgeActual--;
                  avatar.setImageResource(avatars[imatgeActual]);
              }
                break;

         }
    }
}
