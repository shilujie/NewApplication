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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bawei.newapplication.R;

public class ThreeFragment extends Fragment   {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getActivity(), R.layout.fragment_three, null);
        return inflate;
    }
}
