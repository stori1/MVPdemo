package com.example.administrator.mvpdemo.presenter;

import android.graphics.Bitmap;

import com.example.administrator.mvpdemo.model.IModel;
import com.example.administrator.mvpdemo.model.IModelImpl;
import com.example.administrator.mvpdemo.view.INewsView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13.
 */

public class IViewPresenterImpl implements IViewPresenter{
    private IModel mImodel;
    private INewsView mInewsView;
    private int number;
    private int page;

    public IViewPresenterImpl(INewsView newsView, final int number, final int page){
        this.mInewsView = newsView;
        this.mImodel = new IModelImpl(number, page);
        this.number = number;
        this.page = page;
        new Thread(new Runnable() {
            @Override
            public void run() {
                loadNews(number,page);
            }
        }).start();
    }

    @Override
    public List<Bitmap> loadNews(int number, int page) {
        return mImodel.loadNews(number,page);
    }
}
