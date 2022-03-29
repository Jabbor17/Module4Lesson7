package com.masterandroid.module4lesson7

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class Task4 : AppCompatActivity() {
    private var textInputLayout: TextInputLayout? = null
    private var textInputEditText: TextInputEditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task4)
        initViews()
    }

    private fun initViews() {
        textInputLayout = findViewById(R.id.layout_input)
        textInputEditText = findViewById(R.id.edt_input)
        textChangedListener()
        onKeyListener()
    }

    private fun onKeyListener() {
        textInputEditText!!.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    Toast.makeText(applicationContext, "goooooo", Toast.LENGTH_SHORT).show()
                    return true
                }
                return false
            }
        })
    }

    private fun textChangedListener() {
        textInputEditText!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable) {
                if (Character.isDigit(s.toString()[s.toString().length - 1])) {
                    textInputLayout!!.error = "Digit input"
                } else {
                    textInputLayout!!.isErrorEnabled = false
                }
            }
        })
    }
}