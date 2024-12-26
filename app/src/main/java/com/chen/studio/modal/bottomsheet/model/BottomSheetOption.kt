package com.chen.studio.modal.bottomsheet.model

import android.content.Context

enum class BottomSheetOption(val onClick: (Context) -> Unit) {
    HALF_1STEP(onClick = { }),
    FULL_1STEP(onClick = { }),
    HALF_2STEP(onClick = { })
}