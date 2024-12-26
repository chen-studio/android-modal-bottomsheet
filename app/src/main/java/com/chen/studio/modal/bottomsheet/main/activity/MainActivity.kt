package com.chen.studio.modal.bottomsheet.main.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import com.chen.studio.modal.bottomsheet.databinding.MainActivityBinding
import com.chen.studio.modal.bottomsheet.main.adapter.MainAdapter
import com.chen.studio.modal.bottomsheet.model.BottomSheetOption

class MainActivity : ComponentActivity() {
    private val binding: MainActivityBinding by lazy {
        MainActivityBinding.inflate(layoutInflater)
    }
    private val adapter: MainAdapter by lazy { MainAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() = with(binding) {
        recyclerView.layoutManager = LinearLayoutManager(
            /* context = */ baseContext,
            /* orientation = */ VERTICAL,
            /* reverseLayout = */ false
        )
        recyclerView.adapter = adapter
        adapter.submitList(BottomSheetOption.entries)
    }
}
