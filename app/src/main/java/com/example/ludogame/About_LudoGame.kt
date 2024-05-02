package com.example.ludogame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController


class About_LudoGame : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_about__ludo_game, container, false)
        val textredirect = view.findViewById<TextView>(R.id.textView1)
        textredirect.setOnClickListener {
            findNavController().navigate(R.id.action_about_LudoGame_to_howToPlay)
        }
        return view
    }


}