package com.bawei.newapplication.fragment;
/*
 *@auther:史陆杰
 *@Date: 2019/11/29
 *@Time:18:51
 *@Description:${DESCRIPTION}
 **/


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bawei.newapplication.MainActivity;
import com.bawei.newapplication.R;

public class TwoFragment extends Fragment   {

    private Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getActivity(), R.layout.fragment_two, null);
        button = inflate.findViewById(R.id.but);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.ddd();
            }
        });
    }
}
