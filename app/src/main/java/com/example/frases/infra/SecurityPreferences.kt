package com.example.frases.infra

import android.content.Context
import android.content.SharedPreferences
import java.security.AccessControlContext

class SecurityPreferences (val context: Context){    // passando o contexto para classe

    private val mSharedPreferences = context.getSharedPreferences("app",Context.MODE_PRIVATE)  // criando uma variavel fora para nao ficar repetindo chamada


    fun StoreString(key: String, value: String)             //função que recebe arquivos a serem gravados
    {
        mSharedPreferences.edit().putString(key,value).apply()
    }

    fun GetString(key: String)    : String                          // função que chama arquivos gravados
    {
return mSharedPreferences.getString(key,"") ?: ""
    }
}