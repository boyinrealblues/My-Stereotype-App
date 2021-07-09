package com.example.stereotype.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import com.example.stereotype.R
import com.example.stereotype.databinding.FragmentBlankBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val TAG = "BlankFragment"
class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return  DataBindingUtil.inflate<FragmentBlankBinding>(inflater, R.layout.fragment_blank,container,false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.findViewById<BottomNavigationView>(R.id.bottom_nav_view)?.visibility = View.VISIBLE
        activity?.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)?.setNavigationIcon(R.drawable.ic_back)

    }
}