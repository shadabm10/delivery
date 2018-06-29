package com.sketch.deliveryboy.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.sketch.deliveryboy.Adapter.AdapterMessages;
import com.sketch.deliveryboy.R;

import java.util.ArrayList;




public class All extends Fragment {
    ArrayList<String> order_id;
    ListView list_messages;
    AdapterMessages adapterMessages;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);

        order_id = new ArrayList<>();
        order_id.add("Nick");
        order_id.add("Joy");
        order_id.add("Rose");
        order_id.add("Mark");
        order_id.add("Henry");

        list_messages = (ListView)view.findViewById(R.id.list_messages);

        adapterMessages = new AdapterMessages(getActivity(), order_id);
        list_messages.setAdapter(adapterMessages);
        adapterMessages.notifyDataSetChanged();

        return view;
    }
}
