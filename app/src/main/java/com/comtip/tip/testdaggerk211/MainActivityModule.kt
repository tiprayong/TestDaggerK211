package com.comtip.tip.testdaggerk211

import com.comtip.tip.testdaggerk211.Data.ApiService
import com.comtip.tip.testdaggerk211.Presenter.MainContract
import com.comtip.tip.testdaggerk211.Presenter.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by TipRayong on 27/3/2561 13:35
 * TestDaggerK211
 */

@Module
class MainActivityModule {

@Provides
    fun provideMainView(mainActivity: MainActivity): MainContract.View = mainActivity


@Provides
    fun providePresenter(view: MainContract.View, api:ApiService): MainContract.UserActionListener{
    return MainPresenter(view, api)
}
}


