package com.test_api

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.StaggeredGridLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val call = RetrofitInitializer().repositoryService().list()
        call.enqueu(object : Callback<List<Repository>?> {
            override fun onResponse(call: Call<List<Repository>?>,
                                    response: Response<List<Repository>?>) {

                response?.body()?.let {
                    val repositorys: List<Repository> = it
                    configureList(repositorys)
                }
            }

            override fun onFailure(call: Call<List<Repository>?>,
                                   t: Throwable) {
                Log.e("onFailure error", t?.message)
            }

        })
    }

    private fun configureList(repositorys: List<Repository>) {
        val recyclerView = recyclerView_Repository
        recyclerView.adapter = RepositoryAdapter(repositorys, this)
        val layoutManager = StaggeredGridLayoutManager(
                2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }
}
