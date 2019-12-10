package com.tom.atm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PockerCard extends ConstraintLayout {
    int value;

    public PockerCard(Context context){
        super(context);
    }
    public PockerCard(Context context, AttributeSet attrs){
        super(context, attrs);
        inflate(context,R.layout.poker,this);
        ImageView typeImage = findViewById(R.id.type);
        
    }

}
