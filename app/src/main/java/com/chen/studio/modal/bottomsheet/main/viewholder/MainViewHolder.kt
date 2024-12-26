package com.chen.studio.modal.bottomsheet.main.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.chen.studio.modal.bottomsheet.databinding.MainItemBinding
import com.chen.studio.modal.bottomsheet.model.BottomSheetOption

class MainViewHolder(
    private val binding: MainItemBinding,
    private val onClick: (BottomSheetOption) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: BottomSheetOption) {
        binding.root.setOnClickListener { onClick(item) }
        binding.titleText.text = item.name
    }
}