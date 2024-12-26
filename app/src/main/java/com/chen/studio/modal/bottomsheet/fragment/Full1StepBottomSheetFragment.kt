package com.chen.studio.modal.bottomsheet.fragment

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chen.studio.modal.bottomsheet.R
import com.chen.studio.modal.bottomsheet.databinding.BottomSheetFragmentBinding
import com.chen.studio.modal.bottomsheet.ext.setHeightRatio
import com.chen.studio.modal.bottomsheet.model.BottomSheetOption
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class Full1StepBottomSheetFragment : BottomSheetDialogFragment() {
    private var _binding: BottomSheetFragmentBinding? = null
    private val binding: BottomSheetFragmentBinding get() = requireNotNull(_binding)

    override fun getTheme(): Int = R.style.BottomSheet

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        BottomSheetDialog(requireContext(), theme)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = BottomSheetFragmentBinding.inflate(
        /* inflater = */ inflater,
        /* parent = */ container,
        /* attachToParent = */ false
    )
        .also { _binding = it }
        .root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.titleText.text = BottomSheetOption.FULL_1STEP.name
        setHeightRatio(
            root = binding.root,
            collapsedRatio = 1F,
            expandedRatio = 1F
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): Full1StepBottomSheetFragment = Full1StepBottomSheetFragment()
    }
}
