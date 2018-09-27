package com.test_api

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_list_repositories.view.*

class RepositoryViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

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




