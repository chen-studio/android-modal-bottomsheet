package com.chen.studio.modal.bottomsheet.model

import androidx.fragment.app.FragmentManager
import com.chen.studio.modal.bottomsheet.fragment.Full1StepBottomSheetFragment
import com.chen.studio.modal.bottomsheet.fragment.Half1StepBottomSheetFragment
import com.chen.studio.modal.bottomsheet.fragment.Half2StepBottomSheetFragment

enum class BottomSheetOption(val onClick: (FragmentManager) -> Unit) {
    HALF_1STEP(
        onClick = { fragmentManager ->
            Half1StepBottomSheetFragment.newInstance().show(
                /* manager = */ fragmentManager,
                /* tag = */ null
            )
        }
    ),
    FULL_1STEP(
        onClick = { fragmentManager ->
            Full1StepBottomSheetFragment.newInstance().show(
                /* manager = */ fragmentManager,
                /* tag = */ null
            )
        }
    ),
    HALF_2STEP(
        onClick = { fragmentManager ->
            Half2StepBottomSheetFragment.newInstance().show(
                /* manager = */ fragmentManager,
                /* tag = */ null
            )
        }
    )
}