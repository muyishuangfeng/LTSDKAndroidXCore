package com.sdk.ltgame.core.impl;

import android.app.Activity;

import com.sdk.ltgame.core.model.LoginResult;


public interface OnLoginStateListener {
    /**
     * 登录状态
     *
     * @param activity 上下文
     * @param result   登录结果
     */
    void onState(Activity activity, LoginResult result);
}
