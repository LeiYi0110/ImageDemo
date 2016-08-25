package com.example.lei.imagedemo;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by lei on 8/17/16.
 */

public class ImageListViewAdapter extends BaseAdapter implements View.OnClickListener {

    private LayoutInflater listContainer;

    public interface ImageListClickedDelegate
    {
        public void didClickedImageView(ImageView imageView);
    }

    private ImageListClickedDelegate delegate;

    public ImageListViewAdapter(Context context, ImageListClickedDelegate delegate)
    {
        listContainer = LayoutInflater.from(context);
        this.delegate = delegate;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub

        return 10;
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {
        // TODO Auto-generated method stub
        //arg1 = listContainer.inflate(R.layout.stock_data_cell_view, null);


        /*
        if (arg1 == null)
        {
            arg1 = listContainer.inflate(R.layout.local_video_list_item, null);
        }
        */


        arg1 = listContainer.inflate(R.layout.list_view_item, null);

        ImageView imageView1 = (ImageView)arg1.findViewById(R.id.list_item_image_1);
        imageView1.setOnClickListener(this);




        //imageView1.setImageDrawable(R.drawable.i1);





        return arg1;
    }

    @Override
    public void onClick(View view)
    {
        delegate.didClickedImageView((ImageView)view);
    }


}
