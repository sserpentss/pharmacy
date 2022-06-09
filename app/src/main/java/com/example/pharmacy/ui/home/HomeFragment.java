package com.example.pharmacy.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.pharmacy.R;
import com.example.pharmacy.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private ListView listView;
    private String[] array;
    private ArrayAdapter<String> adapter;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //создание списка
//        listView = getActivity().findViewById(R.id.list_item);
//        array = getResources().getStringArray(R.array.med_array);
//        //array = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.med_array)));
//        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, array);
//        listView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}