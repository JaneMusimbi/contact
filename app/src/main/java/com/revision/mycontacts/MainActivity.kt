package com.revision.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.revision.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContact()
    }
    fun displayContact(){
        var contact=Contact("Jane","jane@gmail.com","0712344565","616 korongo road","")
        var contact1=Contact("Paul","paul@gmail.com","0700044565","616 korongo road","")
        var contact2=Contact("Nora","nora@gmail.com","0710144565","616 korongo road","")
        var contact3=Contact("Kadi","kadi@gmail.com","0712344022","616 korongo road","")
        var contact4=Contact("Jane","jane@gmail.com","0712344565","616 korongo road","")
        var contact5=Contact("John","john@gmail.com","0700044565","616 korongo road","")
        var contact6=Contact("Peter","peter@gmail.com","0710144565","616 korongo road","")
        var contact7=Contact("James","james@gmail.com","0712344022","616 korongo road","")
        var contactList= listOf(contact,contact1,contact2,contact3)

        var contactAdapter=ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdapter


    }
}