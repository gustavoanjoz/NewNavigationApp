package com.example.newnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class firstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val button1 = view.findViewById<Button>(R.id.fragmentLeft_button)
        val button2 = view.findViewById<Button>(R.id.fragmentRight_button)

        button1.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)}
        button2.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_thirdFragment)}

        return view
    }
}