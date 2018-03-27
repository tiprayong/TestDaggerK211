package com.comtip.tip.testdaggerk211.Presenter

import com.comtip.tip.testdaggerk211.Data.ApiService
import com.comtip.tip.testdaggerk211.Presenter.MainContract

/**
 * Created by TipRayong on 27/3/2561 13:43
 * TestDaggerK211
 */
class MainPresenter(val view: MainContract.View, val api:ApiService)
    : MainContract.UserActionListener {
    override fun refresh() {

        api.loadData()
        view.showLoading()

    }
}


