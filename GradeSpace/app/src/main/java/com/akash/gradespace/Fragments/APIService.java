package com.akash.gradespace.Fragments;

import com.akash.gradespace.Notifications.MyResponse;
import com.akash.gradespace.Notifications.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService
{
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAPk5Ehrk:APA91bEoqtvt1rVjlEBBZz24Z8k8BAoDtNiEYxQVVfD7OPwtkafB8LQjhn_irR8tKmUvEVcXWhmtMrMvpIsdjqFDATvvARmqxTkvGzcLIRY-trIGeu9973D3PHfh3J4Z82mvU5KXk7Gz"
    })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
