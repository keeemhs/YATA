package com.example.withme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.withme.R;
import com.example.withme.ui.home.HomeFragment;

public class Fragment_board extends Fragment {

    private View view;
    private Button btn1;
    private String result;

    @Nullable
    @Override


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_board,container,false);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Object binding = null;
    }
}

