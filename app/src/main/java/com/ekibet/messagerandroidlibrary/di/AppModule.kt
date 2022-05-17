package com.ekibet.messagerandroidlibrary.di

import com.ekibet.messagerandroidlibrary.MessagerAndroidLibraryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun provideMessagerAndroidLibraryImpl() = MessagerAndroidLibraryImpl()
}