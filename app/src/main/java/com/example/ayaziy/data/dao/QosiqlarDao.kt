package com.example.ayaziy.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.ayaziy.data.model.Qosiqlar

@Dao
interface QosiqlarDao {
    @Query("SELECT * FROM qosiqlar")
    fun getAllQosiqlar():List<Qosiqlar>
}