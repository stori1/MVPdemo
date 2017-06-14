package com.example.administrator.mvpdemo.model;

import android.graphics.Bitmap;
import android.util.LruCache;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13.
 */

public class Cache {
    private LruCache<String, Bitmap> mMemoryCache;
    /**
     * 将内存的1/8用作缓存。
     * */
    public Cache(List<String> list){
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        int cacheSize = maxMemory/8;
        mMemoryCache = new LruCache<String, Bitmap>(cacheSize){
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getByteCount();
            }
        };
    }

    /**
     * 定义将加载的图片，添加进缓存中。
     * */
    public void addBitmapToCache(String key, Bitmap value){
        if (mMemoryCache.get(key) == null){
            mMemoryCache.put(key, value);
        }
    }
    /**
     * 定义从缓存中加载图片。
     * */

    public Bitmap getBitMapFromCache(String key){
       return mMemoryCache.get(key);
    }


    /**
     *
     * */
}
