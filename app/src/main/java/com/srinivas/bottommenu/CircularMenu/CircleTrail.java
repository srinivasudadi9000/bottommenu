package com.srinivas.bottommenu.CircularMenu;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.srinivas.bottommenu.R;

import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class CircleTrail extends AppCompatActivity {
    Boolean isCircle = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle_trail);

        final RecyclerView recyclerView =(RecyclerView)findViewById(R.id.recycler);
        final CircleLayoutManager circleLayoutManager = new CircleLayoutManager(this);
        final ScrollZoomLayoutManager scrollZoomLayoutManager = new ScrollZoomLayoutManager(this,Dp2px(10));
        recyclerView.addOnScrollListener(new CenterScrollListener());
        recyclerView.setLayoutManager(circleLayoutManager);
        recyclerView.setAdapter(new Adapter());

        //recyclerView.setLayoutManager(scrollZoomLayoutManager);
         recyclerView.setLayoutManager(circleLayoutManager);
    }

    public int Dp2px(float dp) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyViewHolder(LayoutInflater.from(CircleTrail.this).inflate(R.layout.my_image,parent,false));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            int index = (position+1)%6;
            int res = 0;
            switch (index){
                case 0:
                    res = R.drawable.spinning;
                    break;
                case 1:
                    res = R.drawable.spinning;
                    break;
                case 2:
                    res = R.drawable.spinning;
                    break;
                case 3:
                    res = R.drawable.spinning;
                    break;
                case 4:
                    res = R.drawable.spinning;
                    break;
                case 5:
                    res = R.drawable.spinning;
                    break;
            }
            ((MyViewHolder)holder).imageView.setImageResource(res);
            ((MyViewHolder)holder).imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getBaseContext(),"Thsodfiads",Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            public MyViewHolder(View itemView){
                super(itemView);
                imageView = (ImageView) itemView.findViewById(R.id.image);

            }
        }
    }

}
