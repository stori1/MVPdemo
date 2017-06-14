package com.example.administrator.mvpdemo.view;

import android.graphics.Bitmap;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13.
 * View类的接口类，由ViewImpl实现，由ViewPresenter调用。
 */

public interface INewsView {
    //展现正在加载中
    void showProgress();
    //加载图片
    void addView(List<Bitmap> mList);
    //加载完成后隐藏进度条
    void hideProgress();
    //加载失败，显示网络错误或者加载失败
    void showError();
}
