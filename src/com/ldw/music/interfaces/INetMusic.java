package com.ldw.music.interfaces;


public interface INetMusic<T> {
	/**
	 * 根据演唱者从网络上获取歌的列表
	 * @param singerName
	 */
	public void searchMusicOfSinger(String singerName);
	/**
	 * 根据歌曲名和演唱者从网络上获取歌曲列表
	 * @param singName
	 * @param musicName
	 * @return
	 */
	public void searchMusic(String singName,String musicName);
	
	/**
	 * 根据歌曲名从网络上获取歌曲列表
	 * @param musicName
	 * @return
	 */
	public void searchMusic(String musicName);
	/**
	 * 下载音乐
	 * @param song_id
	 */
	public void downloadMuisc(String song_id);
	
}
