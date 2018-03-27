package com.comtip.tip.testdaggerk211.Presenter

/**
 * Created by TipRayong on 27/3/2561 13:38
 * TestDaggerK211
 */
interface MainContract {

    interface View{
        fun showLoading()
    }

    interface  UserActionListener {
        fun refresh()
    }
}
