package com.revision.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.revision.mycontacts.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

class ContactRvAdapter (var ContactList:List<Contact>):
RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=ContactList.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvPhone.text=currentContact.phoneNumber
        holder.binding.tvEmail.text=currentContact.email
        holder.binding.tvAddress.text=currentContact.address

        Picasso.get()
            .load(currentContact.image)
            .resize(300,300)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.binding.ivContact)

        val context=holder.itemView.context
        holder.binding.ivContact.setOnClickListener{
            Toast
                .makeText(context,"You have clicked the image",Toast.LENGTH_SHORT)
                .show()
        }
        holder.binding.cvContact.setOnClickListener {
            val intent=Intent(context,viewContactActivity::class.java)
            intent.putExtra("Name",currentContact.name)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("phoneNumber",currentContact.phoneNumber)
            intent.putExtra("IMAGE",currentContact.image)
            context.startActivity(intent)
            holder.binding.ivContact.setOnClickListener {
                Toast.makeText(context,"You have clicked on my face",Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    override fun getItemCount(): Int {
        return ContactList.size

    }
}

class  ContactViewHolder(val binding:ContactListItemBinding):
       RecyclerView.ViewHolder(binding.root){


    }