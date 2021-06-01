package com.example.ayaziy.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "qosiqlar")
data class Qosiqlar(
    @PrimaryKey val id:Int,
    @ColumnInfo(name="name")
    val name:String,
    @ColumnInfo(name="text")
    val text:String,
    @ColumnInfo(name="is_favorite")
    var favorite:Int,
    @ColumnInfo(name="type")
    val type:Int
)