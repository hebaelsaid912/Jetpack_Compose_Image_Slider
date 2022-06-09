package com.hebaelsaid.art.model

import com.hebaelsaid.art.R

data class SplashModel(
    val pageCount:Int = 0,
    val imageSrc:Int = R.drawable.splash_img_1
)
val splashList = listOf(
    SplashModel(
        pageCount= 0,
        imageSrc= R.drawable.splash_img_1
    ),SplashModel(
        pageCount= 1,
        imageSrc= R.drawable.splash_img_2
    ),SplashModel(
        pageCount= 2,
        imageSrc= R.drawable.splash_img_3
    ),SplashModel(
        pageCount= 3,
        imageSrc= R.drawable.splash_img_4
    ),SplashModel(
        pageCount= 4,
        imageSrc= R.drawable.splash_img_5
    )

)
