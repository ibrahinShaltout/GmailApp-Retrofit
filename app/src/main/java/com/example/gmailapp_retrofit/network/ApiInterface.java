package com.example.gmailapp_retrofit.network;

import com.example.gmailapp_retrofit.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
