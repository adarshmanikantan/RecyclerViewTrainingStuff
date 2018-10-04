package com.example.user.recyclerviewtrainingstuff;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

//1.dont extend now.just define class recyclerviewadapter

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder>{
    //type logt gets the string for debuging purpose
    private static final String TAG = "RecyclerViewAdapter";

    //9.after implementing methods add arraylist to stare data

    private ArrayList<String> mImagenames = new ArrayList<>();
    private ArrayList<String> mImages=new ArrayList<>();
    private Context mContext;

    //10.alt+shif+insert to create contructs of arraylist create.if language changes ctrl+shift+insert
    //optional make context ro front

   public RecyclerViewAdapter(Context mContext,ArrayList<String> mImagenames, ArrayList<String> mImages) {
        this.mImagenames = mImagenames;
        this.mImages = mImages;
        this.mContext = mContext;
    }
          //oncreateviewholder for inflating view
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //11.inflate layout to view
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutlistitem,parent,false);
         //12.pass view to viewholder
        ViewHolder holder=new ViewHolder(view);
        //13.return viewholder
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
           //14.put log to check if the method called for each single item in list
        Log.d(TAG,"onbindviewholder called.......");
           //15. image using glide.takes context.type of img as bitmap,load image in tht uri,into target holder.image
        //image widget for each list
        Glide.with(mContext)
                      .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);
           //16.set text to viewholder textview of list item.
        holder.imagename.setText(mImagenames.get(position));

        //17.onclick for list item
        holder.parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onclick hit...."+mImagenames.get(position));
                Toast.makeText(mContext,mImagenames.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
       //18.add size of either imagenams or image     .definessize of list.goto mainactivity.java
        return mImagenames.size();
    }


    //2.create class viewholder and extend it from recyclerview.viewholder .
    //3. turns red?click on red bulb select constructor matching super get viewgolder constructor
    public class ViewHolder extends RecyclerView.ViewHolder{
        //4.declare widgets for viewholder in layoutlistitem.xml
        CircleImageView image;
        TextView imagename;
        RelativeLayout parentlayout;
        public ViewHolder(View itemView) {
            super(itemView);
//5.connect the widgets to viewholder with view object itemview in constructor

            image=itemView.findViewById(R.id.image);
            imagename=itemView.findViewById(R.id.imagename);
            parentlayout=itemView.findViewById(R.id.parentlayout);

            //6.now only go up extend class recyclerviewadapter with recyclerview.adapter.
            // 7.specify type of adapter in <> brackets the viewholder class defined.
            //8.turns red ? click on red bulb and implement methods.
        }
    }


}
