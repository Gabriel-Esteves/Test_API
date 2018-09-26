package com.test_api

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.test_api.RepositoryAdapter.ViewHolder


class RepositoryAdapter(private val repositories: List<Repository>,
                        private val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list_repositories, parent, false)
        return RecyclerView.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val repository = repositories[position]
        holder?.let {
            it.textNameRepository = repository.nameRepo
            it.
            it.textDescriptionRepository = repository.descriptionRepo
            it.imageUser  = repository
            it.textUsernameRepository = repository.imageUser
            it.extSecondNameRepository = repository.subnameUser
        }
    }

    override fun getItemCount(): Int {
        return repositories.size
    }
}

