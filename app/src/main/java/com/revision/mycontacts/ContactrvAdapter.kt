package com.revision.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class ContactRvAdapter (var ContactList:List<Contact>):
RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
     var itemView=LayoutInflater.from(parent.context)
         .inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=ContactList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvPhone.text=currentContact.phoneNumber
        holder.tvEmail.text=currentContact.email
        holder.tvAddress.text=currentContact.address
    }

    override fun getItemCount(): Int {
        return ContactList.size

    }
}

class  ContactViewHolder(itemView:View):
       RecyclerView.ViewHolder(itemView){
        var tvName=itemView.findViewById<TextView>(R.id.tvName)
        var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
        var tvPhone=itemView.findViewById<TextView>(R.id.tvPhone)
        var tvAddress=itemView.findViewById<TextView>(R.id.tvAddress)

    }