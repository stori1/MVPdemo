package com.example.administrator.mvpdemo.model;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2017/6/13.
 */

public interface ImageApi {

    @GET("{number}/{page}")
    Call<ResponseBody> load(@Path("number") int number, @Path("page") int page);
}
