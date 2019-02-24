package com.srinivas.bottommenu;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.srinivas.bottommenu.CircularTrail.CircularLayout;

public class CCirculartrail extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circular_trail);

        CircularLayout cl = (CircularLayout) findViewById(R.id.circular_layout);
        if (cl != null) {
            cl.setOnCircularItemClickListener(new CircularLayout.OnCircularItemClickListener() {
                @Override
                public void onCircularItemClick(int index) {
                    Toast.makeText(getApplicationContext(), "Item " + index + " clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
