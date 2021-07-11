package com.example.stereotype.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.stereotype.R
import com.example.stereotype.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return DataBindingUtil.inflate<FragmentBlank2Binding>(inflater,R.layout.fragment_blank2,container,false).root
    }

}