package com.chen.studio.modal.bottomsheet.main.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.chen.studio.modal.bottomsheet.databinding.MainItemBinding
import com.chen.studio.modal.bottomsheet.model.BottomSheetOption

class MainViewHolder(
    private val binding: MainItemBinding,
) : RecyclerView.ViewHolder(binding.root) {
    private val context: Context = binding.root.context

    fun bind(item: BottomSheetOption) {
        binding.root.setOnClickListener { item.onClick(context) }
        binding.titleText.text = item.name
    }
}