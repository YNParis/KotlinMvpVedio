package com.yxn.kotlinmvpvedio

import android.app.Application
import com.squareup.leakcanary.RefWatcher

/**
 * Created by YXN 2019/1/7.
 */
class MyApplication : Application() {

    private var refWatcher: RefWatcher? = null
    
}