package com.my_application.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.my_application.myapplication.R
import com.my_application.myapplication.databinding.FragmentWeatherBinding


class WeatherFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentWeatherBinding.inflate(inflater,container,false)

        return binding.root
    }


}