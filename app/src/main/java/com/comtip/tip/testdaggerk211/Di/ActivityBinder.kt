package com.comtip.tip.testdaggerk211.Di

import android.app.Activity
import com.comtip.tip.testdaggerk211.MainActivity
import com.comtip.tip.testdaggerk211.MainActivityComponent
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by TipRayong on 27/3/2561 13:58
 * TestDaggerK211
 */

@Module
abstract class ActivityBinder {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivity(builder: MainActivityComponent.Builder):AndroidInjector.Factory<out Activity>
}


