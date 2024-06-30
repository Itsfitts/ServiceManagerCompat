package dev.sanmer.su.wrap

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class ThrowableWrapper(
    val original: Throwable
) : Parcelable {
    companion object {
        fun Throwable.wrap() = ThrowableWrapper(this)
    }
}