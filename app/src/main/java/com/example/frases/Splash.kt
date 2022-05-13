package com.example.frases

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.frases.infra.Constants
import com.example.frases.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_splash.*

class Splash : AppCompatActivity(), View.OnClickListener {

   private lateinit var mShared : SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mShared = SecurityPreferences(this)

        supportActionBar!!.hide()

        buttonSave.setOnClickListener(this)
  verify()

    }



    override fun onClick(view: View) {

        val id = view.id

        if(id==R.id.buttonSave)
        {
         validateName()
        }



    }
   fun verify()
   {
       val nome = mShared.GetString(Constants.key.keyname)
       if(nome!="")
       {
           val intent = Intent(this,MainActivity::class.java)
           startActivity(intent)
           finish()
       }
   }

    private fun validateName()
    {
        if(EditName.text.toString() != "")
        {
            val nameUser = EditName.text.toString()

            mShared.StoreString(Constants.key.keyname,nameUser)

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
        else
        {
            Toast.makeText(this, "Informe seu nome", Toast.LENGTH_SHORT).show()
        }
    }
}