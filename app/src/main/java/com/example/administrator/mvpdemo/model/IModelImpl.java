package com.example.administrator.mvpdemo.model;

import android.graphics.Bitmap;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Administrator on 2017/6/13.
 */

public class IModelImpl implements IModel{
    private int number;
    private int page;
    private List<Bitmap> mList;

    public IModelImpl(int number, int page){
        this.number = number;
        this.page = page;
    }
    @Override
    public List<Bitmap> loadNews(int number, int page) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io/api/data/%E7%A6%8F%E5%88%A9/")
                .build();
        ImageApi service = retrofit.create(ImageApi.class);
        Call<ResponseBody> call = service.load(number, page);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Gson gson = new Gson();
                try {
                    List<Bean.ImageDetail> results = gson.fromJson(response.body().string(),
                            Bean.class).getResults();
                    ArrayList<String> urls = new ArrayList<String>();
                    for (int i = 0; i < results.size(); i++){
                        urls.add(results.get(i).getUrl());
                        Log.d("TAG", urls.get(i));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
        return mList;
    }
}
