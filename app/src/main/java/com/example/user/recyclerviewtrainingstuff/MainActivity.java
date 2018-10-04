package com.example.user.recyclerviewtrainingstuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//logt
private static final String TAG = "MainActivity";

//19. variables

    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mImageurls=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //log to know if oncreate started
        Log.d(TAG,"oncreate started...");
        //21.call initbitmaps
        initImageBitmaps();

    }
    //20.fn to add data to arraylist the image and text.urls from net for the image.call it in oncreate
    //for this internet permission need to be given in manifest as image gets loaded from net
    private void initImageBitmaps(){
        Log.d(TAG,"prepare bitmaps");
        mImageurls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");

        mImageurls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

        mImageurls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");

        mImageurls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");


        mImageurls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

        mImageurls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageurls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageurls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageurls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");

        mImageurls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");

        mImageurls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

        mImageurls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");

        mImageurls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");


        mImageurls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

        mImageurls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageurls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageurls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageurls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");
        mImageurls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");

        mImageurls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

        mImageurls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");

        mImageurls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");


        mImageurls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

        mImageurls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageurls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageurls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageurls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");


//27.
        initRecyclerView();
    }
    //22.fn for recyclerview

    private void initRecyclerView(){
        Log.d(TAG,"RECYCLERVIEW INIT>>>>>");
        //23 connect recycler view
        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        //24.make adapter for recycler view . the previously made class recyclerviewadapter object to connect tht class to RV
        //pass params to the class with context,and arraylist elements created here for data
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mNames,mImageurls);
        //25.set our adapter to our RV
        recyclerView.setAdapter(adapter);
    //26.set layoutmanager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //27.call init recyclerview fn in initbitmaps to connect recyclerview and the data

    }
}
//copy package name goto logcat editfilter configuration.
//in that paste our package name to show log related only to our app.