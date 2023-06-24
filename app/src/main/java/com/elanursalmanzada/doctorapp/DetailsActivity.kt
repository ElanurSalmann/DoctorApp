package com.elanursalmanzada.doctorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elanursalmanzada.doctorapp.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val doctor=intent.getSerializableExtra("Doctor") as? Doctors
        if(doctor!=null){
            binding.image.setImageResource(doctor.image)
           binding.namedoc.text=doctor.name
            binding.description.text=doctor.sector
            binding.commoninfo.text=doctor.info
        }
        binding.back.setOnClickListener {
            super.onBackPressed()
        }
    }

    override fun onBackPressed() {

    }
}
