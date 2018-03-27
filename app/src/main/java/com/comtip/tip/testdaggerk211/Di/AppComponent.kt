package com.comtip.tip.testdaggerk211.Di

import android.app.Application
import com.comtip.tip.testdaggerk211.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by TipRayong on 27/3/2561 14:01
 * TestDaggerK211
 */

interface ComponentBuilder<out C>{
    fun build(): C
}

@Component(modules = arrayOf(AndroidInjectionModule::class,
        AppModule::class,
        ActivityBinder::class
        ))

interface AppComponent {
    fun inject(app: MainApplication)

    @Component.Builder
    interface Builder: ComponentBuilder<AppComponent> {
        @BindsInstance
        fun application(application: Application): Builder
    }
}

