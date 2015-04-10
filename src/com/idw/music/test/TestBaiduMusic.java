package com.idw.music.test;

import android.test.AndroidTestCase;

import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.idw.music.impl.BaiduMusicImpl;
import com.ldw.music.interfaces.INetMusic;
import com.ldw.music.model.BaiduMusic;
import com.ldw.music.net.RequestManager;

public class TestBaiduMusic extends AndroidTestCase{
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		RequestManager.init(getContext());
	}
	
	public void testSearchMusic() throws Exception{
		INetMusic<BaiduMusic> iMusic = new BaiduMusicImpl<BaiduMusic>(new Listener<BaiduMusic>() {

			@Override
			public void onResponse(BaiduMusic baiduMusic) {
				// TODO Auto-generated method stub
				if(baiduMusic != null){
					System.out.println(baiduMusic);
				}
			}
		}, new ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				// TODO Auto-generated method stub
				System.out.println("出错");
			}
		});
		iMusic.searchMusic("泡沫");
	}

	
}
