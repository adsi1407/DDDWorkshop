package com.example.dddworkshop.dimodule;

import com.example.application.integration.Connectivity;
import com.example.devicehardware.ConnectivityImpl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class ConnectivityModule {

    @Binds
    public abstract Connectivity bindConnectivity(ConnectivityImpl connectivity);
}
