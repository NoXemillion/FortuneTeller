package com.example.fortuneteller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fortuneteller.databinding.FragmentZodiacsBinding


class Zodiacs : Fragment() {
    lateinit var zodiacsBinding : FragmentZodiacsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        zodiacsBinding = FragmentZodiacsBinding.inflate(inflater)
        return zodiacsBinding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = Zodiacs()
    }
}