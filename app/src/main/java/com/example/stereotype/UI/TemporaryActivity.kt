package com.example.stereotype.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import androidx.databinding.DataBindingUtil
import com.example.stereotype.R
import com.example.stereotype.databinding.ActivityTemporaryBinding

class TemporaryActivity : AppCompatActivity() {
    lateinit private var binding : ActivityTemporaryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_temporary)

        setSupportActionBar(binding.toolbarSecond)

        binding.toolbarSecond.setNavigationOnClickListener {
            binding.drawerSecond.openDrawer(Gravity.LEFT)
        }
    }
}
