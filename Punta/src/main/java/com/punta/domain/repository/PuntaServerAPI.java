package com.punta.domain.repository;

import com.punta.domain.model.PuntaPoint;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Q on 08-Jul-16.
 */
public interface PuntaServerAPI {

    @GET("class")
    Call<Observable<List<PuntaPoint>>> getPosts();
}
