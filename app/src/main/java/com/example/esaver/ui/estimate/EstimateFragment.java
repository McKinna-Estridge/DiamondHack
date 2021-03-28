package com.example.esaver.ui.estimate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.esaver.R;

public class EstimateFragment extends Fragment {

    private EstimateViewModel estimateViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        estimateViewModel =
                new ViewModelProvider(this).get(EstimateViewModel.class);
        View root = inflater.inflate(R.layout.fragment_estimate, container, false);
        final TextView textView = root.findViewById(R.id.text_estimate);
        estimateViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
}