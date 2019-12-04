package com.sdk.ltgame.core.impl;

import android.app.Activity;

import com.sdk.ltgame.core.model.RechargeResult;


public interface OnRechargeListener {

    void onState(Activity activity, RechargeResult result);
}
