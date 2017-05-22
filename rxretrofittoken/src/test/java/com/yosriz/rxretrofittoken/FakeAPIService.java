package com.yosriz.rxretrofittoken;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FakeAPIService {

    @GET("something/{id}")
    Observable<SomeFakeObject> getSomething(@Path("id") long someId);
}
