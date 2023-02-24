package com.bimabagaskhoro.phincon.myintentmultimodule

import com.bimabagaskhoro.phincon.route.ActivityRouter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RouteModule {
    @Singleton
    @Provides
    fun bindRouter(): com.bimabagaskhoro.phincon.route.ActivityRouter {
        return ActivityRouterImpl()
    }
}