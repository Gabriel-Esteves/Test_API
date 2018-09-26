package com.test_api

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_list_repositories.view.*


class RepositoryAdapter(private val repositories: List<Repository>,
                        private val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val repository = repositories[position]
        holder?.let {
            it.bindView(repository)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list_repositories, parent, false)
        return RecyclerView.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return repositories.size
    }

    class RepositoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(repository: Repository) {


            val nameRepo = itemView.textNameRepository
            val descriptionRepo = itemView.textDescriptionRepository
            val userName = itemView.textUsernameRepository
            val secondNameUser = itemView.textSecondNameRepository


            nameRepo.text = repository.nameRepo
            descriptionRepo.text = repository.descriptionRepo
            userName.text = repository.nameUser
            secondNameUser.text = repository.subnameUser
        }
    }
}

