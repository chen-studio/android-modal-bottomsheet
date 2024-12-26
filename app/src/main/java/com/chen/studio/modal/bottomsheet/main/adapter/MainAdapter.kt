package com.chen.studio.modal.bottomsheet.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.chen.studio.modal.bottomsheet.databinding.MainItemBinding
import com.chen.studio.modal.bottomsheet.main.viewholder.MainViewHolder
import com.chen.studio.modal.bottomsheet.model.BottomSheetOption

class MainAdapter : ListAdapter<BottomSheetOption, MainViewHolder>(diffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder =
        MainViewHolder(
            binding = MainItemBinding.inflate(
                /* inflater = */ LayoutInflater.from(parent.context),
                /* parent = */ parent,
                /* attachToParent = */ false
            )
        )


    override fun onBindViewHolder(holder: MainViewHolder, position: Int) =
        holder.bind(getItem(position))

    companion object {
        private val diffCallback: DiffUtil.ItemCallback<BottomSheetOption> =
            object : DiffUtil.ItemCallback<BottomSheetOption>() {
                override fun areItemsTheSame(
                    oldItem: BottomSheetOption,
                    newItem: BottomSheetOption
                ): Boolean = oldItem == newItem

                override fun areContentsTheSame(
                    oldItem: BottomSheetOption,
                    newItem: BottomSheetOption
                ): Boolean = true
            }
    }
}