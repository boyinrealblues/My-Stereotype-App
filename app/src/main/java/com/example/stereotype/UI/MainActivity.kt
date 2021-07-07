package com.example.stereotype.UI

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.stereotype.R
import com.example.stereotype.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity(),BottomNavigationView.OnNavigationItemSelectedListener {

    lateinit private var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setSupportActionBar(binding.toolbar)

        binding.bottomNavView.setOnNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.list_menu_item -> {
                fragmentTransaction<BlankFragment>()
                return true
            }

            R.id.person_menu_item -> {
                fragmentTransaction<BlankFragment2>()
                return true
            }
            else -> return false
        }
    }

  inline fun <reified T : Fragment> fragmentTransaction(){

        if(supportFragmentManager.fragments.size==0)
                supportFragmentManager.commit{
                    add<T>(R.id.container)
                    addToBackStack(null)
                    setReorderingAllowed(true)
                }
            else
                supportFragmentManager.commit{
                    replace<T>(R.id.container)
                    addToBackStack(null)
                    setReorderingAllowed(true)
                }
    }

}