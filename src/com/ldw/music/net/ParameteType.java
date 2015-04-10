package com.ldw.music.net;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ParameteType implements ParameterizedType {
	private Class<?> c = null;
	private Type[] types = null;
	public ParameteType(Class<?> c,Type...types ){
		this.c = c;
		this.types = types;
	}
	
	@Override
	public Type[] getActualTypeArguments() {
		// TODO Auto-generated method stub
		if(types != null){
			return types;
		}
		return null;
	}

	@Override
	public Type getOwnerType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type getRawType() {
		// TODO Auto-generated method stub
		return c;
	}

}
