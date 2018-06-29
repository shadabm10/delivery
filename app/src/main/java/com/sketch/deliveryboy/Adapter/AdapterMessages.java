package com.sketch.deliveryboy.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sketch.deliveryboy.R;

import java.util.ArrayList;




/**
 * Created by Ankita on 6/20/2018.
 */
public class AdapterMessages extends BaseAdapter {
    Context context;
    TextView tv_user_name;
    //Global_Class global_class;
    ArrayList<String> order_id;
    LayoutInflater inflater;

    //  ArrayList<HashMap<String,String>> arr_order;



    public AdapterMessages(Context c,/* ArrayList<HashMap<String,String>> arr_order,*/  ArrayList<String> order_id) {

        context = c;
        this.order_id = order_id;

        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        /*global = (GlobalClass)mContext.getApplicationContext();
        orderDetailORMS=orderDetailsORM;*/


    }

    @Override
    public int getCount() {
        return order_id.size();
    }

    @Override
    public Object getItem(int i) {
        return order_id.get(i);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }


    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        View view1=null;

        //   inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view1 == null) {



            //   View view1 = inflater.inflate(R.layout.received_single_row, null, true);
            view1 = inflater.inflate(R.layout.message_single_row, null, true);

            //tv_user_name = (TextView)view1.findViewById(R.id.tv_user_name);
           // tv_user_name.setText(order_id.get(position));


        }else{
            Log.d("TAG", "getView: else");
        }

        return view1;
    }



}