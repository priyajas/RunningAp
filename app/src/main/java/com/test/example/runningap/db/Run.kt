package com.test.example.runningap.db

import android.graphics.Bitmap
import androidx.room.Entity

@Entity(tableName = "running_table")
data class Run(
    var img: Bitmap? = null,
    var timeStamp: Long = 0L,
    var avgSpeedInKMH: Float = 0f,
    var distanceInMeters: Int = 0,
    var timeInMillis: Long = 0L
) {

}