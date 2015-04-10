package com.idw.music.domain.interfaces;
/**
 * 实体音乐类需要实现的接口
 * @author jian.fu
 *
 */
public interface IMusic {
	/**
	 * 获取歌曲名
	 */
	public String getSong();
	/**
	 * 获取演唱者
	 */
	public String getSinger();
	/**
	 * 获取演唱者的大图
	 * @return
	 */
	public String getSingerPicLarge();
	/**
	 * 获取演唱者的小图
	 */
	public String getSingerPicSmall();
	/**
	 * 获取歌曲ID
	 */
	public String getSongId();
	
}
