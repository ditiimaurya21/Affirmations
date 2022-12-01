package com.example.affirmations.modell
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affs(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)