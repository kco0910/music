package com.ldw.music.net;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class RequestManager {
	private static RequestQueue mRequestQueue = null;
	
	/**
	 * 初始化Volley请求
	 * @param context
	 */
	public static void init(Context context){
		mRequestQueue = Volley.newRequestQueue(context);
	}
	
	/**
	 * 执行网络请求
	 * 
	 * @param request
	 * @param tag
	 */
	public static void addRequest(Request<?> request, Object tag) {
		if (tag != null) {
			request.setTag(tag);
		}
		mRequestQueue.add(request);
	}
	
	/**
	 * 取消网络请求
	 * 
	 * @param tag
	 */
	public static void cancelAll(Object tag) {
		mRequestQueue.cancelAll(tag);
	}
}
