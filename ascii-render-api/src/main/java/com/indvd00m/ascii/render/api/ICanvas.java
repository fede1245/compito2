package com.indvd00m.ascii.render.api;

public interface ICanvas {


	String getText();


	int getHeight();


	int getWidth();


	void draw(int x, int y, char c);


	void draw(int x, int y, char c, int count);


	void draw(int x, int y, String s);


	void draw(int x, int y, String s, int count);


	void clear();


	char getChar(int x, int y);


	char setChar(int x, int y, char c);


	boolean isCharDrawed(int x, int y);


	ICanvas trim();


	ICanvas trimSpaces();


	ICanvas trimNulls();


	ICanvas trim(char trimChar);


	ICanvas subCanvas(IRegion region);

}
