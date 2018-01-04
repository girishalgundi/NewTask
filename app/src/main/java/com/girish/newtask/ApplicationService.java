package com.girish.newtask;

import com.girish.newtask.model.HandShakeInput;
import com.girish.newtask.model.HandShakeResult;
import com.girish.newtask.model.T24_MiniStatementInput;
import com.girish.newtask.model.T24_MiniStatementResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Dell-PC on 12/13/2017.
 */

public interface ApplicationService {


    @POST("api/HandShake")
    Call<HandShakeResult> doHandShake(@Body HandShakeInput input);


    @POST("/api/MiniStatement")
    Call<T24_MiniStatementResult> T24_MiniStatement(@Body T24_MiniStatementInput input);

}
