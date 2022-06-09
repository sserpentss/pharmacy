package com.example.pharmacy.ui.med_help;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MedHelpViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MedHelpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}