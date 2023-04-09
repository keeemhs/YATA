package com.example.withme.ui.plus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PlusViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PlusViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("게시글 작성");
    }

    public LiveData<String> getText() {
        return mText;
    }
}