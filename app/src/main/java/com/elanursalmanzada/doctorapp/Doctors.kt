package com.elanursalmanzada.doctorapp

import java.io.Serializable

data class Doctors(var image:Int, var name:String, var sector:String, var comment:String,var isOpen:Boolean, var info:String):Serializable {
}