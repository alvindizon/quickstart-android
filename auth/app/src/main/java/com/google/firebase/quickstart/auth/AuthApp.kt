package com.google.firebase.quickstart.auth

import androidx.multidex.MultiDexApplication
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig

class AuthApp: MultiDexApplication() {

    lateinit var remoteConfigManager: RemoteConfigManager

    override fun onCreate() {
        super.onCreate()
        remoteConfigManager = FirebaseRemoteConfigManager(Firebase.remoteConfig)
        remoteConfigManager.initializeConfig()
        remoteConfigManager.fetchLiveUpdates()
    }
}