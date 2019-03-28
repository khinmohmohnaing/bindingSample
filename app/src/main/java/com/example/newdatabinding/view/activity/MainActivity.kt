package com.example.newdatabinding.view.activity

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.newdatabinding.presenter.MainPresenter
import com.example.newdatabinding.R
import com.example.newdatabinding.databinding.ActivityMainBinding
import com.example.newdatabinding.model.UserInfo
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {
    @Inject
    lateinit var mainPresenter: MainPresenter
    lateinit var binding: com.example.newdatabinding.databinding.ActivityMainBinding
    override fun add(location: String) {
        Log.i("dkajkd",location)
    }

    override fun showData(userinfo: UserInfo) {
        userinfo.phoneNo=phoneNo.text.toString()
        userinfo.password=password.text.toString()
        Toast.makeText(this,userinfo.phoneNo+" "+userinfo.password,Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_main
        )
        val temperatureData = UserInfo("Hamburg", "10")
        binding.setUserInfo(temperatureData)
        binding.setAppPresenter(mainPresenter)

    }
}
