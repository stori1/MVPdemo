package com.example.administrator.mvpdemo.model;

import android.graphics.Bitmap;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13.
 */

public interface IModel {
    List<Bitmap> loadNews(int number, int page);
}
