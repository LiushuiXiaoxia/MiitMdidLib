package cn.mycommons.miitmdidlib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bun.miitmdid.core.JLibrary

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        JLibrary.InitEntry(this.applicationContext)
    }
}