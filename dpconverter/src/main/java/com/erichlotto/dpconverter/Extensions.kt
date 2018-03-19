package com.erichlotto.dpconverter

import android.content.res.Resources
import android.util.DisplayMetrics

/**
 * Created by erich on 3/19/18.
 */

/**
 * This method converts device specific pixels to density independent pixels.
 *
 * @param px A value in px (pixels) unit. Which we need to convert into db
 * @return A float value to represent dp equivalent to px value
 */
fun Float.toDp() : Float {
    val metrics = Resources.getSystem().getDisplayMetrics()
    return this / (metrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
}

/**
 * This method converts dp unit to equivalent pixels, depending on device density.
 *
 * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
 * @return A float value to represent px equivalent to dp depending on device density
 */
fun Float.toPx() : Float {
    val metrics = Resources.getSystem().getDisplayMetrics()
    return this * (metrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
}
