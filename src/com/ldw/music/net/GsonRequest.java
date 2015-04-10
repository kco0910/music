package com.ldw.music.net;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;

import android.text.TextUtils;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;

public class GsonRequest<T> extends Request<T> {
	private Gson mGson = null;
	private Type mType = null;
	private Listener<T> mListener = null;
	public GsonRequest(Type type,int method, String url, Listener<T> listener,ErrorListener errorlistener) {
		super(method, url, errorlistener);
		// TODO Auto-generated constructor stub
		mListener = listener;
		mGson = new Gson();
		mType = type;
	}


	@Override
	protected void deliverResponse(T response) {
		// TODO Auto-generated method stub
		mListener.onResponse(response);
	}

	@Override
	protected Response<T> parseNetworkResponse(NetworkResponse response) {
		// TODO Auto-generated method stub
		String json = "";
		Response<T> res = null;
		if(response != null){
			try {
				json = new String(response.data, HttpHeaderParser.parseCharset(response.headers)).trim();
				if(!TextUtils.isEmpty(json)){
					//System.out.println("json -->"+json);
					T c = mGson.fromJson(json, mType);
					res = Response.success(c, HttpHeaderParser.parseCacheHeaders(response));
				}
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return res;
	}
}
