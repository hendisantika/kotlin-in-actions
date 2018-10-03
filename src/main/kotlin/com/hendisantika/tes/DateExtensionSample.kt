package com.hendisantika.tes

import com.hendisantika.customer.*
import java.text.SimpleDateFormat

/**
 * Created by hendisantika on 6/24/17.
 */
class DateExtensionSample {
    // available in any where
    fun dateSample() {
        val nowString = dateNow()
        val date = dateParse("2016-02-02 20:30:45")
        val dateStr1 = date.asString()
        val dateStr2 = date.asString(SimpleDateFormat("yyyyMMdd.HHmmss"))
        val dateStr3 = date.asString("yyyy-MM-dd-HH-mm-ss")

        // easy way to get timestamp
        val timestamp1 = timestamp()
        // equal to
        val timestamp2 = System.currentTimeMillis()
        val dateStr4 = timestamp1.asDateString()

        println("Data : \n$nowString\n$date\n$dateStr1\n$dateStr2\n$dateStr3\n$timestamp1\n$timestamp2\n$dateStr4")
    }

}


