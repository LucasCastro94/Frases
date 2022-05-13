package com.example.frases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.frases.Repository.GeratorPhrases
import com.example.frases.Repository.phrases
import com.example.frases.infra.Constants
import com.example.frases.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_splash.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mShared: SecurityPreferences

    var mPhrasefilter: Int = Constants.categoryID.morning

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mShared = SecurityPreferences(this)

        supportActionBar!!.hide()

        imageMorning.setOnClickListener(this)
        imageAfternoon.setOnClickListener(this)
        imageEvening.setOnClickListener(this)
        buttonNewPhrase.setOnClickListener(this)

        textName.text="Olá, ${mShared.GetString(Constants.key.keyname)}"

        imageMorning.setBackgroundColor(resources.getColor(R.color.orangeopacy))
        handleNewPhrase()

    }


    override fun onClick(view: View) {

        val id = view.id

        val listfilter = listOf(R.id.imageMorning, R.id.imageAfternoon, R.id.imageEvening)

        if (id == R.id.buttonNewPhrase) {
            handleNewPhrase()
        }

        if (id in listfilter) {
            handleFilter(id)
        }

    }

    private fun handleNewPhrase() {
      TextPhrase.text =  GeratorPhrases().GetPhrases(mPhrasefilter)
    }

    private fun handleFilter(id: Int) {

        imageMorning.setBackgroundColor(resources.getColor(R.color.orange))
        imageAfternoon.setBackgroundColor(resources.getColor(R.color.orange))
        imageEvening.setBackgroundColor(resources.getColor(R.color.orange))




        when (id) {
            R.id.imageMorning -> {
                imageMorning.setBackgroundColor(resources.getColor(R.color.orangeopacy))
                mPhrasefilter = Constants.categoryID.morning

            }
            R.id.imageAfternoon -> {
                imageAfternoon.setBackgroundColor(resources.getColor(R.color.orangeopacy))
                mPhrasefilter = Constants.categoryID.afternoon
            }
            R.id.imageEvening -> {
                imageEvening.setBackgroundColor(resources.getColor(R.color.orangeopacy))
                mPhrasefilter = Constants.categoryID.evening
            }
        }

    }

}