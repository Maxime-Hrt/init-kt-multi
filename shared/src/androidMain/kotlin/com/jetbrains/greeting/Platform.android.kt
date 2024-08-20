package com.jetbrains.greeting

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android is Crazy ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()