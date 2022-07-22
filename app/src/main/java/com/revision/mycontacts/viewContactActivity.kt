package com.revision.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class viewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewcontactactivity)
        getExtras()
    }
    fun getExtras(){
        var name= intent.extras?.getString("Name")
        var address=intent.extras?.getString("ADDRESS")
        var phoneNumber=intent.extras?.getString("phoneNumber")
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
    }
}