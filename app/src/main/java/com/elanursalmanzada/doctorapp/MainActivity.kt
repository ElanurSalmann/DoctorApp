package com.elanursalmanzada.doctorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elanursalmanzada.doctorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val doctorList=listOf(
            Doctors(R.drawable.doctor,"dr.Gilang Segara Bening","Heart • Persahabatan Hospital", "(1221)", true,"dr.Gilang is one of the best doctors in the \nPersahabatan Hospital. He has saved more than \n1000 patients in the past 3 years. He has also\nreceived many awards from domestic and \nabroad as the best doctors. He is available on a \nprivate or schedule."),
            Doctors(R.drawable.doctor2,"dr.Shabil Chan","Dental • Columbia Asia Hospital", "(964)", true,"dr.Gilang is one of the best doctors in the \nPersahabatan Hospital. He has saved more than \n1000 patients in the past 3 years. He has also\nreceived many awards from domestic and \nabroad as the best doctors. He is available on a \nprivate or schedule."),
            Doctors(R.drawable.doctor3,"dr.Mustakim","Eye • Salemba Carolus Hospital", "762", true," dr.Gilang is one of the best doctors in the \nPersahabatan Hospital. He has saved more than \n1000 patients in the past 3 years. He has also\nreceived many awards from domestic and \nabroad as the best doctors. He is available on a \nprivate or schedule."),
            Doctors(R.drawable.doctor4,"dr.Sunribatini","Eye", "(545)", false,"dr.Gilang is one of the best doctors in the \nPersahabatan Hospital. He has saved more than \n1000 patients in the past 3 years. He has also\nreceived many awards from domestic and \nabroad as the best doctors. He is available on a \nprivate or schedule.dr.Gilang is one of the best doctors in the \\nPersahabatan Hospital. He has saved more than \\n1000 patients in the past 3 years. He has also\\nreceived many awards from domestic and \\nabroad as the best doctors. He is available on a \\nprivate or schedule.")
        )
        val adapter=DoctorAdapter(this, doctorList)
        binding.rv.adapter=adapter
    }
}