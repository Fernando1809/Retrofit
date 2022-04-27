package com.example.retrofit;

import com.example.retrofit.modelo.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("posts")
     Call<List<Posts>> getPosts();

    }

