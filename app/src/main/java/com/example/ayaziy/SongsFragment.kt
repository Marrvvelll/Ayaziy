package com.example.ayaziy
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import androidx.fragment.app.Fragment
import com.example.ayaziy.data.QosiqlarDatabase
import com.example.ayaziy.data.dao.QosiqlarDao
import kotlinx.android.synthetic.main.songs_layout.*
class SongsFragment:Fragment(R.layout.songs_layout) {
    var adapter=AdapterSongs()
    private lateinit var dao:QosiqlarDao
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerSongs.adapter=adapter
        dao=QosiqlarDatabase.getInstance(requireContext()).dao()
        adapter.models=dao.getAllQosiqlar()
    }
}