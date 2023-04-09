package com.example.withme.ui.home;

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

import com.example.withme.Fragment_board;
import com.example.withme.R;
import com.example.withme.databinding.FragmentBoardBinding;
import com.example.withme.databinding.FragmentMypageBinding;

public class HomeFragment extends Fragment {

    private View view;
    Button btn1;
    private String result;
    private FragmentBoardBinding binding;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btn1 = view.findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() { // fragment_board로 이동
            @Override
            public void onClick(View view) {
                Fragment fragment_board = new Fragment_board();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.container,fragment_board).commit();
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Object binding = null;
    }
}