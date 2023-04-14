package com.google.firebase.quickstart.auth

interface RemoteConfigManager {
    fun initializeConfig()
    fun fetchLiveUpdates()
}