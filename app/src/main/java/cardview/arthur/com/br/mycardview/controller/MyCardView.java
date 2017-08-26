package cardview.arthur.com.br.mycardview.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import cardview.arthur.com.br.mycardview.R;
import cardview.arthur.com.br.mycardview.adapter.MyRecycleViewAdapter;
import cardview.arthur.com.br.mycardview.model.Card;

public class MyCardView extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_card_view);

        recyclerView = (RecyclerView) findViewById(R.id.my_rec_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setHasFixedSize(true);



        recyclerView.setAdapter(new MyRecycleViewAdapter(this, Card.listCard(), onClickListener()));

//        myRecycleView = (RecyclerView) findViewById(R.id.myrecicleView);
//        myRecycleView.setLayoutManager(new LinearLayoutManager(this));
//        myRecycleView.setItemAnimator(new DefaultItemAnimator());
//
//        myRecycleView.setHasFixedSize(true);
//
//        List<Animal> animais = Animal.listAnimais();
//
//        myRecycleView.setAdapter(new AnimalAdapterRecicleView(this, animais, onClickListener()));

    }


    public MyRecycleViewAdapter.MyRecycleListener onClickListener(){
        return new MyRecycleViewAdapter.MyRecycleListener(){
            @Override
            public void onClickListener(View view, int position) {

            }
        };
    }
}
