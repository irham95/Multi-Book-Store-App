package example.com.tugasakhir020irham011yuni.entity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(resource: Int) = LayoutInflater.from(context).inflate(resource, this, false) as View