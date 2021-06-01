package com.example.ayaziy.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ayaziy.data.dao.QosiqlarDao
import com.example.ayaziy.data.model.Qosiqlar


@Database(entities = [Qosiqlar::class],version = 1)
abstract class QosiqlarDatabase:RoomDatabase() {
    companion object{
        private lateinit var INSTANCE:QosiqlarDatabase
        fun getInstance(context: Context):QosiqlarDatabase=
            Room.databaseBuilder(
                context,
                QosiqlarDatabase::class.java,
                "database.db"
            )
                .createFromAsset("database.db")
                .allowMainThreadQueries()
                .build()
    }
    abstract fun dao():QosiqlarDao
}