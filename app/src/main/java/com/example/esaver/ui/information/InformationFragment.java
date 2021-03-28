package com.example.esaver.ui.information;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.esaver.R;

public class InformationFragment extends Fragment {

    private InformationViewModel informationViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        informationViewModel =
                new ViewModelProvider(this).get(InformationViewModel.class);
        View root = inflater.inflate(R.layout.fragment_information, container, false);
        final TextView textView = root.findViewById(R.id.text_information);
        textView.setText(Html.fromHtml(
                "<h2><b>What Are Carbon Emissions and Why Do They Matter?</b></h2>" +
                        "<p>An individual’s carbon emissions are not necessarily the same thing as that person’s carbon footprint, but carbon emissions play a big part. A carbon footprint is the total amount of greenhouse gas emissions that come from the production, use, and waste of a product or service. These greenhouse gasses include carbon dioxide, methane, nitrous oxide, and fluorinated gasses. They can have a range of negative effects from depleting our ozone to changing ecological processes, but they are primarily harmful because they absorb radiation which traps heat in our atmosphere. This directly results in poor air quality,  global warming, altered weather patterns, and climate changes, all of which have a rippling negative effect on the health of our environment.</p>" +
                        "<p>While there are several greenhouse gasses, roughly 80% of the greenhouse gasses in our atmosphere is carbon dioxide. This is why we focus on carbon emissions (the total amount of CO2 emitted). This is also why often an individual’s carbon footprint will be measured in pounds or metric tons of carbon dioxide emitted (CO2e). In short, carbon emissions are the biggest determinant of both the total amount of greenhouse gasses in the atmosphere and in turn, carbon footprints.</p>" +
                        "<p>Carbon dioxide is emitted naturally, of course, through the exchange of carbon dioxide between the oceans and the atmosphere, animal respiration, and organism decomposition. Nature accounts for this emission and has a built in system to balance CO2 emissions, as plants absorb CO2 and oceans absorb as much as they emit. However, as humans we have greatly tipped the balance through immense amounts of unnatural CO2 emissions. These emissions come from the extracting, production, burning, and use of fossil fuels (coal, natural gas, and oil), the burning of biological materials, and certain  chemical reactions.</p>" +
                        "<p>This may all seem like a lot of information, and maybe a little complex. So what does this mean for you and me? We can all pitch in to help lower carbon emissions. After all, each of us have a carbon footprint of our own! This can be from using more fuel efficient ways of transportation to finding ways to use less gas and electricity in your home. Or you can “offset” your carbon emissions. Offsets are a way to decrease your carbon footprint by investing in programs that work to rebuild our environment."
        ));
        return root;
    }
}