package com.comtip.tip.testdaggerk211.Di

import android.app.Application
import android.content.Context
import com.comtip.tip.testdaggerk211.Data.ApiService
import com.comtip.tip.testdaggerk211.Data.ApiServiceImpl
import com.comtip.tip.testdaggerk211.MainActivityComponent
import dagger.Module
import dagger.Provides

/**
 * Created by TipRayong on 27/3/2561 13:30
 * TestDaggerK211
 */

@Module (subcomponents = arrayOf(MainActivityComponent::class))
class AppModule {

    @Provides
    fun provideContext(application: Application): Context = application

    @Provides
    fun provideApiService():ApiService = ApiServiceImpl()
}

