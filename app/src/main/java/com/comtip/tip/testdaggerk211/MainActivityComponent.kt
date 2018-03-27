package com.comtip.tip.testdaggerk211

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by TipRayong on 27/3/2561 13:50
 * TestDaggerK211
 */
@Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}


