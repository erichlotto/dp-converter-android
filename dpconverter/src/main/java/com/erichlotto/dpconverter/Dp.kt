package com.erichlotto.dpconverter


/**
 * Created by erich on 3/19/18.
 */
class Dp {

    companion object {

        /**
         * This method converts device specific pixels to density independent pixels.
         *
         * @param px A value in px (pixels) unit. Which we need to convert into db
         * @return A float value to represent dp equivalent to px value
         */
        fun fromPx(px : Float) : Float {
            return px.toDp()
        }

        /**
         * This method converts dp unit to equivalent pixels, depending on device density.
         *
         * @param dp A value in dp (density independent pixels) unit. Which we need to convert into pixels
         * @return A float value to represent px equivalent to dp depending on device density
         */
        fun toPx(dp : Float) : Float {
            return dp.toPx()
        }

    }
}

