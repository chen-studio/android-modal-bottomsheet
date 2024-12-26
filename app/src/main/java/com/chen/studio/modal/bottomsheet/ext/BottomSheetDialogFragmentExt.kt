package com.chen.studio.modal.bottomsheet.ext

import android.view.View
import androidx.annotation.FloatRange
import androidx.annotation.Px
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.STATE_COLLAPSED
import com.google.android.material.bottomsheet.BottomSheetBehavior.STATE_EXPANDED
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

@Px
fun Fragment.getHeightPixels(): Int = resources.displayMetrics.heightPixels

fun BottomSheetDialogFragment.getBehavior(): BottomSheetBehavior<*>? =
    (dialog as? BottomSheetDialog)?.behavior

/**
 * Set BottomSheetDialogFragment's height into 2 step
 *
 * If the values of collapsedRatio and expandedRatio are the same, it works only 1 step regardless of initialState
 *
 * @param initialState STATE_COLLAPSED or STATE_EXPANDED
 * @param collapsedRatio height ratio when bottom sheet is collapsed
 * @param expandedRatio height ratio when bottom sheet is expanded
 */
fun BottomSheetDialogFragment.setHeightRatio(
    root: View,
    initialState: Int = STATE_COLLAPSED,
    @FloatRange(from = 0.1, to = 1.0) collapsedRatio: Float = 0.7F,
    @FloatRange(from = 0.1, to = 1.0) expandedRatio: Float = 1.0F
) {
    validateParams(initialState, collapsedRatio, expandedRatio)

    root.layoutParams.height = (getHeightPixels() * expandedRatio).toInt()
    getBehavior()?.peekHeight = (getHeightPixels() * collapsedRatio).toInt()
    getBehavior()?.state = initialState
}

private fun validateParams(initialState: Int, collapsedRatio: Float, expandedRatio: Float) =
    when {
        initialState != STATE_COLLAPSED && initialState != STATE_EXPANDED ->
            throw IllegalArgumentException(
                "initialState should be STATE_COLLAPSED or STATE_EXPANDED"
            )

        collapsedRatio.toBigDecimal() < 0.1.toBigDecimal() ->
            throw IllegalArgumentException("collapsedRatio should be more than 0.1")

        expandedRatio.toBigDecimal() < collapsedRatio.toBigDecimal() ->
            throw IllegalArgumentException("expandedRatio should be more than collapsedRatio")

        else -> Unit
    }