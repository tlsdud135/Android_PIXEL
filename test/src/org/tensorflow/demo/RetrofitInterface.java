package org.tensorflow.demo;


import com.google.gson.JsonElement;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitInterface {
    @POST("/user/login")
    Call<LoginResult> executeLogin(@Body HashMap<String, String> map);

    @POST("/user/signup")
    Call<Void> executeSignup(@Body HashMap<String, String> map);

    @POST("/user/check") //이메일 보내기 (인증번호용)
    Call<CheckResult> executeCheck(@Body HashMap<String, String> map);

    @GET("/dict/dictAll")
    Call<JsonElement> getDictAll();

    @POST("/dict/word")
    Call<JsonElement> getDictWord(@Body HashMap<String, String> map);

    @POST("/wordList/listAll")
    Call<JsonElement> getListAll(@Body HashMap<String, String> map);

    @POST("/wordList/listAdd")
    Call<JsonElement> addList(@Body HashMap<String, String> map);
    //Call<JsonElement> addList(@Body WordInformation wordInformation);

    @POST("/wordList/listDel")
    Call<JsonElement> delList(@Body HashMap<String, String> map);

    @POST("/user/findPW")
    Call<Void> findpw(@Body HashMap<String, String> map);

    //    API한테 값 보내주기
    @POST("/point")
    Call<JsonElement> sendLandmark(@Body HashMap<String, float[][]> map);
}
