package com.example.stereotype.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.stereotype.R
import com.example.stereotype.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
       return  DataBindingUtil.inflate<FragmentBlankBinding>(inflater, R.layout.fragment_blank,container,false).root
    }


}