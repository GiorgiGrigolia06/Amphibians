package com.example.amphibians.data

import com.example.amphibians.network.AmphibiansApiService
import com.example.amphibians.network.AmphibianItem

interface AmphibiansListRepository {
    suspend fun getAmphibianDetails(): List<AmphibianItem>
}

class NetworkAmphibiansRepository(
    private val amphibianApiService: AmphibiansApiService
) : AmphibiansListRepository {
    override suspend fun getAmphibianDetails(): List<AmphibianItem> = amphibianApiService.getList()
}