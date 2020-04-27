package cn.mycommons.miitmdidlib

import android.app.Activity
import android.os.Bundle
import com.bun.miitmdid.core.JLibrary

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        JLibrary.InitEntry(this.applicationContext)
    }
}