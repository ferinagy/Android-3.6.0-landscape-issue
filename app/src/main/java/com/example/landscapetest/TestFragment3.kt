package com.example.landscapetest

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class TestFragment3 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            inflater.inflate(R.layout.landscape_layout3, container, false)
        } else
            inflater.inflate(R.layout.base_layout3, container, false)

        val optionalView: View? = view.findViewById(R.id.landscapeOnlyView3)

        return view
    }
}
