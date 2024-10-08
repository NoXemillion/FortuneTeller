package com.example.fortuneteller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fortuneteller.databinding.FragmentFunctionsBinding


class Functions : Fragment() {

    lateinit var functionBinding : FragmentFunctionsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        functionBinding = FragmentFunctionsBinding.inflate(inflater)

        // Inflate the layout for this fragment
        return functionBinding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = Functions()
    }
}