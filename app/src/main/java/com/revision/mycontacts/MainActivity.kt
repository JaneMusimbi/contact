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
        var contact=Contact("Jane","jane@gmail.com", "0711234567","616 korongo road","https://images.unsplash.com/photo-1655376406950-a3a992135037?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTR8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact1=Contact("Paul","@paul.com", "0111234567","60karen road","https://images.unsplash.com/photo-1655432961905-70cfc68601b2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTh8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact2=Contact("John","john@gmail.com", "0733234567","616road","https://images.unsplash.com/photo-1645583918683-39fd75293e80?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8N3x8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60")
        var contact3=Contact("Peter","peter@gmail.com", "0211444567","0122kitale","https://images.unsplash.com/photo-1655374631048-1416d81cd20a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8NXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60")
        var contact4=Contact("James","james@gmail.com", "0735354567","22 naroko","https://images.unsplash.com/photo-1655386283686-fc82a1864a10?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8OXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60")
        var contact5=Contact("Caro","caro@gmail.com", "071123343567","6 majengo road","https://images.unsplash.com/photo-1655422701837-c1b86521c1b4?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Nnx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60")
        var contact6=Contact("Anena","anena@gmail.com", "07144444567","616 mukuru","https://images.unsplash.com/photo-1655485676228-fbabfcf8502b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8NHx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60")
        var contact7=Contact("Laura","laura@gmail.com", "0711238888","16 kwangu","https://images.unsplash.com/photo-1655379460199-4625c811fcb6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60")
        var contact8=Contact("Lona","lona@gmail.com", "0711231233411","6ada","https://images.unsplash.com/photo-1655389158915-ed128af11596?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60")
        var contact9=Contact("steve","bakhita@gmail.com", "07112341001","616 hopper","https://images.unsplash.com/photo-1655508342579-d139e8d74bbf?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8M3x8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60")





        var contactList= listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9)

        var contactAdapter=ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdapter


    }
}