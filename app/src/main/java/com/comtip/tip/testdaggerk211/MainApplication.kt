package com.comtip.tip.testdaggerk211

import android.app.Activity
import android.app.Application
import com.comtip.tip.testdaggerk211.Di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by TipRayong on 27/3/2561 14:07
 * TestDaggerK211
 */
class MainApplication : Application(),HasActivityInjector {
    @Inject
    lateinit var  activityDispatchingAndroidInjection:DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityDispatchingAndroidInjection
    }

    override fun onCreate() {
        super.onCreate()
       val appComponent = DaggerAppComponent.builder().application(this).build()
       appComponent.inject(this)


    }
}
