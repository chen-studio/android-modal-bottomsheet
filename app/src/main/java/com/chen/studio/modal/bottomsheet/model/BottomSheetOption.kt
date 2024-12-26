package com.chen.studio.modal.bottomsheet.model

import androidx.fragment.app.FragmentManager
import com.chen.studio.modal.bottomsheet.fragment.Half1StepBottomSheetFragment

enum class BottomSheetOption(val onClick: (FragmentManager) -> Unit) {
    HALF_1STEP(
        onClick = { fragmentManager ->
            Half1StepBottomSheetFragment.newInstance().show(
                /* manager = */ fragmentManager,
                /* tag = */ null
            )
        }
    ),
    FULL_1STEP(onClick = { }),
    HALF_2STEP(onClick = { })
}