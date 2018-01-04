package com.girish.newtask;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dell-PC on 12/13/2017.
 */

public class Utils {

    public static Retrofit getRetrofitBuilder(Context context) {


        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG)
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        else
//            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);

            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .readTimeout(2, TimeUnit.MINUTES)
                .connectTimeout(2, TimeUnit.MINUTES)
                .retryOnConnectionFailure(true)
                .build();


        Retrofit retrofit = new Retrofit.Builder()

                .baseUrl("http://172.20.0.12:8282/") // link url

                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();


        return retrofit;
    }

}
