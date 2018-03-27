package com.comtip.tip.testdaggerk211

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.comtip.tip.testdaggerk211.Data.dataDagger
import com.comtip.tip.testdaggerk211.Presenter.MainContract
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {

    @Inject lateinit var presenter: MainContract.UserActionListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AndroidInjection.inject(this)

        presenter.refresh()


    }

    override fun showLoading() {

        viewTV.setText(dataDagger)
    }

}
