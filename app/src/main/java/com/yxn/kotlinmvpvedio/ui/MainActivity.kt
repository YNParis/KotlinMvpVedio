package com.yxn.kotlinmvpvedio.ui

import android.os.Bundle
import com.yxn.kotlinmvpvedio.R

class MainActivity : BaseActivity() {
    override fun layoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
    }

    override fun initView() {
    }

    override fun start() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun count() {

    }
}
