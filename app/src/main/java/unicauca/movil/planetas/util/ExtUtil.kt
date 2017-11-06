package unicauca.movil.planetas.util

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText

fun ViewGroup.inflate(layoutRes: Int) = LayoutInflater.from(context)
        .inflate(layoutRes, this, false)

fun EditText.text() = text.toString()