package com.revision.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.provider.MediaStore
import android.widget.Toast
import com.revision.mycontacts.databinding.ActivityViewcontactactivityBinding
import com.squareup.picasso.Picasso
import okhttp3.Call

class viewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewcontactactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewcontactactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name= intent.extras?.getString("Name")
        var Call= intent.extras?.getString("CALL")
        var Video=intent.extras?.getString("VIDEO")
        var Message=intent.extras?.getString("MESSAGE")
        var image =binding.imgPhoto

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this, Message,Toast.LENGTH_LONG).show()


        binding.tvCall.text = Call
        binding.tvName1.text=name
        binding.tvVideo.text =Video
        binding.tvMessage.text = Message

        Picasso.get().load(intent.getStringExtra("IMAGE"))
            .resize(200, 200)
            .centerCrop().into(binding.imgPhoto)

    }
}