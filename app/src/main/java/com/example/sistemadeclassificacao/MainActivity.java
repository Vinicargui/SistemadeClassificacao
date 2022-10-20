package com.example.sistemadeclassificacao;

import android.app.Activity;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends Activity {
   TextView txtstatus;
   RatingBar rtbvotacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtstatus = (TextView) findViewById(R.id.txtstatus);
        rtbvotacao = (RatingBar) findViewById(R.id.rtbvotacao);
        txtstatus.setText("Status: Ruim");

        rtbvotacao.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float f, boolean b) {
                if (f == 1)
                    txtstatus.setText("Status: regular");
                else if (f == 2)
                    txtstatus.setText("Status: Bom");
                else if (f == 3)
                    txtstatus.setText("Status: Ótimo");
                else if (f == 4)
                    txtstatus.setText("Status: Exelente");
                else if (f == 5)
                    txtstatus.setText("Status: O mio que tem");
            }

        });
    }
}