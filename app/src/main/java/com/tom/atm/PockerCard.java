package com.tom.atm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PockerCard extends ConstraintLayout {
    int value;
    private ImageView typeImage;
    private TextView leftPoint;
    private TextView rightPoint;

    public PockerCard(Context context){
        super(context);
    }
    public PockerCard(Context context, AttributeSet attrs){
        super(context, attrs);
        inflate(context,R.layout.poker,this);
        typeImage = findViewById(R.id.type);
        leftPoint = findViewById(R.id.left_point);
        rightPoint = findViewById(R.id.right_point);
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
        int type = value / 13;
        int point = (value % 13) + 1;
        switch (type){
            case 0:
                typeImage.setImageResource(R.drawable.clover);
                break;
            case 1:
                typeImage.setImageResource(R.drawable.diamond);
                break;
            case 2:
                typeImage.setImageResource(R.drawable.hearts);
                break;
            case 3:
                typeImage.setImageResource(R.drawable.spades);
                break;
        }
        if (point == 1){
            leftPoint.setText("A");
            rightPoint.setText("A");
        }
        else if (point == 11){
            leftPoint.setText("J");
            rightPoint.setText("J");
        }
        else if (point == 12){
            leftPoint.setText("Q");
            rightPoint.setText("Q");
        }
        else if (point == 13){
            leftPoint.setText("K");
            rightPoint.setText("K");
        }
        else {
            leftPoint.setText(point + "");
            rightPoint.setText(point + "");
        }
    }
}
