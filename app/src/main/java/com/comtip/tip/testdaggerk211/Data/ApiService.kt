package com.comtip.tip.testdaggerk211.Data

/**
 * Created by TipRayong on 27/3/2561 13:24
 * TestDaggerK211
 */
interface ApiService {
    fun loadData()
}

class ApiServiceImpl : ApiService{
    override fun loadData() {
        dataDagger = "Garnet is Sarah"
    }

}
