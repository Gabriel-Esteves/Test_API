package com.test_api

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


class RepositoryAdapter(private val repositories: List<Repository>,
                        private val context: Context) : RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {

    override fun onBindViewHolder(holder: RepositoryViewHolder?, position: Int) {
        val repository = repositories[position]
        holder?.let {
            it.bindView(repository)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RepositoryViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list_repositories, parent, false)
        return RepositoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return repositories.size
    }


}

