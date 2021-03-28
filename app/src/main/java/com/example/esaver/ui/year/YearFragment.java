package com.example.esaver.ui.year;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.esaver.R;

public class YearFragment extends Fragment {

    private YearViewModel yearViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        yearViewModel =
                new ViewModelProvider(this).get(YearViewModel.class);
        View root = inflater.inflate(R.layout.fragment_year, container, false);
        final TextView textView = root.findViewById(R.id.text_year);
        yearViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
}