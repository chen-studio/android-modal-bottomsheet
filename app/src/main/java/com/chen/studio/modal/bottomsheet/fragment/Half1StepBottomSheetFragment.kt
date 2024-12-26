package com.chen.studio.modal.bottomsheet.fragment

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chen.studio.modal.bottomsheet.R
import com.chen.studio.modal.bottomsheet.databinding.Half1StepBottomSheetFragmentBinding
import com.chen.studio.modal.bottomsheet.ext.setHeightRatio
import com.chen.studio.modal.bottomsheet.model.BottomSheetOption
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class Half1StepBottomSheetFragment : BottomSheetDialogFragment() {
    private var _binding: Half1StepBottomSheetFragmentBinding? = null
    private val binding: Half1StepBottomSheetFragmentBinding get() = requireNotNull(_binding)

    override fun getTheme(): Int = R.style.BottomSheet

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        BottomSheetDialog(requireContext(), theme)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = Half1StepBottomSheetFragmentBinding.inflate(
        /* inflater = */ inflater,
        /* parent = */ container,
        /* attachToParent = */ false
    )
        .also { _binding = it }
        .root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.titleText.text = BottomSheetOption.HALF_1STEP.name
        setHeightRatio(
            root = binding.root,
            collapsedRatio = 0.5F,
            expandedRatio = 0.5f
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): Half1StepBottomSheetFragment = Half1StepBottomSheetFragment()
    }
}
