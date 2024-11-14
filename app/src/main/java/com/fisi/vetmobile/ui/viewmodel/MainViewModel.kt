package com.fisi.vetmobile.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fisi.vetmobile.data.model.LoginResponse
import com.fisi.vetmobile.data.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repository = Repository()
    private val _loginResponse = MutableLiveData<LoginResponse?>()
    val loginResponse: LiveData<LoginResponse?> = _loginResponse

    fun login(username: String, password: String) {
        viewModelScope.launch {
            val response = repository.login(username, password)
            _loginResponse.value = response
        }
    }
}
