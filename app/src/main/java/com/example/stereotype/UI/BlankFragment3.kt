package com.example.stereotype.UI

import android.graphics.Insets.add
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.stereotype.R
import com.example.stereotype.databinding.FragmentBlank3Binding
import com.google.android.material.bottomnavigation.BottomNavigationView

class BlankFragment3 : Fragment() {


  lateinit private var binding: FragmentBlank3Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        //Initialization
    binding = DataBindingUtil.inflate<FragmentBlank3Binding>(inflater,R.layout.fragment_blank3,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            //On Home Fragment Enter make icon change also bottom nav hide
        activity?.findViewById<BottomNavigationView>(R.id.bottom_nav_view)?.visibility = View.INVISIBLE
        activity?.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)?.run {
            setNavigationIcon(R.drawable.ic_menu)

        }
        //On button tap , replace home fragment
            binding.button.setOnClickListener {

                parentFragmentManager.commit{
                    replace<BlankFragment>(R.id.container)
                    addToBackStack(null)
                    setReorderingAllowed(true)
                }

            }
        }
    }

