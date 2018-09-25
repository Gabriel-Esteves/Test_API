package com.test_api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

interface RepositoryService {
    @POST("owner")
    Call<Repository> validate(
            @Field("login") String username,
            @Field("avatar_url") String image,
            @Field("description") String descricao
    );
}
