package com.elanursalmanzada.doctorapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.elanursalmanzada.doctorapp.databinding.DoctorItemsBinding

class DoctorAdapter(var mContext: Context, var doctorList: List<Doctors>): RecyclerView.Adapter<DoctorAdapter.DoctorDesignHolder>() {
    inner class DoctorDesignHolder(val binding: DoctorItemsBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorDesignHolder {
        val binding=DoctorItemsBinding.inflate(LayoutInflater.from(mContext))
        return DoctorDesignHolder(binding)
    }

    override fun getItemCount(): Int {
        return doctorList.size
    }

    override fun onBindViewHolder(holder: DoctorDesignHolder, position: Int) {
        val b=holder.binding
        val list=doctorList.get(position)
        b.doctor.setImageResource(list.image)
        b.name.text=list.name
        b.sector.text=list.sector
        b.rate.text=list.comment
        if(list.isOpen==true){
            b.isopen.setImageResource(R.drawable.open)
        }else{
            b.isopen.setImageResource(R.drawable.close)
        }
        b.root.setOnClickListener {
            val intent= Intent(mContext, DetailsActivity::class.java)
            intent.putExtra("Doctor", list)
            mContext.startActivity(intent)

        }

    }

}
