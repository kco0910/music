package com.idw.music.impl;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Request.Method;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.google.gson.reflect.TypeToken;
import com.ldw.music.interfaces.INetMusic;
import com.ldw.music.model.BaiduMusic;
import com.ldw.music.net.GsonRequest;
import com.ldw.music.net.RequestManager;

public class BaiduMusicImpl<T> implements INetMusic<T> {
	/** word 只能是歌曲名*/
	public static final String seachUrl = "http://mp3.baidu.com/dev/api/?tn=getinfo&ct=0&word=%1$s&ie=utf-8&format=json";
	public static final String TAG = "baiduSearch";
	private Listener<T> responseLis = null;
	private ErrorListener errorLis = null;
		
	public BaiduMusicImpl(Listener<T> responseLis,ErrorListener errorLis) {
		// TODO Auto-generated constructor stub
		this.responseLis = responseLis;
		this.errorLis = errorLis;
	}
	@Override
	public void searchMusicOfSinger(String singName) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void searchMusic(String singName, String musicName) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void searchMusic(String musicName) {
		// TODO Auto-generated method stub
		try {
			String url = String.format(seachUrl, URLEncoder.encode(musicName, "UTF-8"));
			Type type = new TypeToken<List<BaiduMusic>>(){}.getType();
			System.out.println(url);
			Request<T> request = new GsonRequest<T>(type, Method.GET, url, responseLis, errorLis){
				@Override
				public Map<String, String> getHeaders() throws AuthFailureError {//必须模拟PC浏览器发送，否则会返回移动端列表页面
					// TODO Auto-generated method stub
					Map<String, String> headers = new HashMap<String, String>();
					headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
					headers.put("Accept-Language", "zh-cn,zh;q=0.5");
					headers.put("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:7.0.1) Gecko/20100101 Firefox/7.0.1)");
					headers.put("Accept-Encoding", "gzip, deflate");
					headers.put("Accept-Charset", "GB2312,utf-8;q=0.7,*;q=0.7");
					headers.put("Connection", "Keep-Alive");
					return headers;
				}
			};
			RequestManager.addRequest(request, TAG);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void downloadMuisc(String song_id) {
		// TODO Auto-generated method stub
		
	}

}
