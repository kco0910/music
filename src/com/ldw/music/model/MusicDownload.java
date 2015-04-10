package com.ldw.music.model;

import java.util.List;

public class MusicDownload {
	private String errorCode = "";
	private MusicData data = null;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data.toString();
	}
	
	
	class MusicData{
		private String xcode = "";
		private List<Song> songList = null;
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return songList.toString();
		}
	}
	
	
	class Song{
		private String queryId = "";
		private String songId = "";
		private String songName = "";
		private String artistId = "";
		private String artistName ="";
		private String lrcLink = "";
		private String songLink = "";
		private String showLink="";
		private String format = "";
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "下载链接:"+showLink;
		}
	}
}
