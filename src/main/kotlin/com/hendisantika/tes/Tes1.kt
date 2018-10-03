package com.hendisantika.tes

import com.hendisantika.customer.*
import java.text.SimpleDateFormat

/**
 * Created by hendisantika on 6/24/17.
 */
class Tes1

fun main(args: Array<String>) {
    println("Testing Data")
    dateSample()

}

fun dateSample() {
    val nowString = dateNow()
    val date = dateParse("2017-06-24 14:09:37")
    val dateStr1 = date.asString()
    val dateStr2 = date.asString(SimpleDateFormat("yyyyMMdd.HHmmss"))
    val dateStr3 = date.asString("yyyy-MM-dd-HH-mm-ss")

    // easy way to get timestamp
    val timestamp1 = timestamp()
    // equal to
    val timestamp2 = System.currentTimeMillis()
    val dateStr4 = timestamp1.asDateString()

    println("nowString : $nowString")
    println("date : $date")
    println("dateStr1 : $dateStr1")
    println("dateStr2 : $dateStr2")
    println("dateStr3 : $dateStr3")
    println("timestamp1 : $timestamp1")
    println("timestamp2 : $timestamp2")
    println("timestamp4 : $dateStr4")
}
