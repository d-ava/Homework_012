package com.example.homework_012

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.example.homework_012.databinding.MainFragmentBinding
import org.json.JSONObject

class MainFragment : Fragment() {


    private var binding: MainFragmentBinding? = null
    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = MainFragmentBinding.inflate(inflater, container, false)

        viewModel.jsParsed()

        binding?.text?.text = viewModel.someText




        return binding?.root


    }


}