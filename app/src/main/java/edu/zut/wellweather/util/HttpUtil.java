package edu.zut.wellweather.util;

/**
 * Created by Intellij IDEA.
 * User:  haosen
 * Date:  2022/06/16
 */

import android.view.textclassifier.TextLinks;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 和服务器的交互
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient cilent = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        cilent.newCall(request).enqueue(callback);


    }

}
