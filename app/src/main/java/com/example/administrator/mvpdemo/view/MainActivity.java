package com.example.administrator.mvpdemo.view;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.presenter.IViewPresenter;
import com.example.administrator.mvpdemo.presenter.IViewPresenterImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity implements INewsView{
    private IViewPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new IViewPresenterImpl(this, 2, 3);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void addView(List<Bitmap> mList) {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError() {

    }
}
