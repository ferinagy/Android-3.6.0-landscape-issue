package com.example.landscapetest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class TestFragment4 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.base_layout4, container, false)

        val optionalView: View? = view.findViewById(R.id.landscapeOnlyView4)

        return view
    }
}
