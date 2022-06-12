package com.jimmy.androidstudyjame_2022.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResId: Int,
    @DrawableRes val imageResId: Int
)
