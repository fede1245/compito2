package com.indvd00m.ascii.render.api;


public interface ITypedIdentified<T> {

	Class<T> getType();


	int getTypedId();

}
