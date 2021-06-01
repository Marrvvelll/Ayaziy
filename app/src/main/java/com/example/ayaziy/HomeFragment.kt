package com.example.ayaziy

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.home.*

class HomeFragment:Fragment(R.layout.home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        songs.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_container,SongsFragment()).commit()

        }
        poems.setOnClickListener {

        }
        videos.setOnClickListener {

        }
        fotos.setOnClickListener {

        }
    }
}