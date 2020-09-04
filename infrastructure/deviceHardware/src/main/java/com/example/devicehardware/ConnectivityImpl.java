package com.example.devicehardware;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

import com.example.application.integration.Connectivity;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class ConnectivityImpl implements Connectivity {

    private final Context context;

    @Inject
    public ConnectivityImpl(@ApplicationContext Context context) {
        this.context = context;
    }

    @Override
    public boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager != null) {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (capabilities != null) {
                    if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR))
                        return true;
                    else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI))
                        return true;
                    else return capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET);
                }
            }
            else {

                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    return activeNetworkInfo != null && activeNetworkInfo.isConnected() && isInternetAvailable();
                }
                catch(Exception ex) {
                    // Log
                }
            }
        }
        return false;
    }

    private boolean isInternetAvailable() {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            return !address.equals("");
        } catch (UnknownHostException e) {
            // Log
        }
        return false;
    }
}
