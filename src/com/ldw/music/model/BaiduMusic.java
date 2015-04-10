package com.ldw.music.model;

import com.idw.music.domain.interfaces.IMusic;

public class BaiduMusic implements IMusic{
	private String song = "";
	private String song_id = "";
	private String singer = "";
	private String singerPicLarge= "";
	private String singerPicSmall = "";
	
	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return song;
	}

	@Override
	public String getSinger() {
		// TODO Auto-generated method stub
		return singer;
	}

	@Override
	public String getSingerPicLarge() {
		// TODO Auto-generated method stub
		return singerPicLarge;
	}

	@Override
	public String getSingerPicSmall() {
		// TODO Auto-generated method stub
		return singerPicSmall;
	}

	@Override
	public String getSongId() {
		// TODO Auto-generated method stub
		return  song_id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "歌名:"+song+",演唱者:"+singer+"";
	}

}
