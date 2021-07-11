package com.example.stereotype.UI

import android.app.Activity
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.Log
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.view.GravityCompat
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
        //Suppose the activity gets destroyed, We are not redrawing it again
        if(savedInstanceState==null)
        {
            Log.e(TAG,"SAVED INSTANCES STATE CHECK BLOCK EXECUTED")
            //This block will be executed only once the activity is created
            supportFragmentManager.commit {
                add<BlankFragment3>(R.id.container)
                setReorderingAllowed(true)
            }
        }
        //Initialization
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(binding.toolbar)
        binding.bottomNavView.setOnNavigationItemSelectedListener(this)
        //On Back button tap Move back to the home activity

        binding.toolbar.setNavigationOnClickListener{
            Log.e(TAG,supportFragmentManager.fragments.toString()+" "+supportFragmentManager.fragments.size.toString())
            if(supportFragmentManager.fragments[supportFragmentManager.fragments.size-1]::class.toString().equals(BlankFragment3::class.toString()))
                binding.drawerLayout.openDrawer(GravityCompat.START)
            else
                supportFragmentManager.popBackStack()
        }
    }

    //Which tab in pressed , corresponds to which fragment is replaced and uploaded, Home fragment is getting replaced here
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
                supportFragmentManager.commit{
                    replace<T>(R.id.container)
                    setReorderingAllowed(true)
                }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"onDestroyed Called")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"onPause Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG,"onRestart Called")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume Called")
    }
}