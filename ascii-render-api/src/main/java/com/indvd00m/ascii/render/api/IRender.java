package com.indvd00m.ascii.render.api;


public interface IRender {


	IContextBuilder newBuilder();


	ICanvas render(IContext context);

	boolean isPseudoCanvas();

	void setPseudoCanvas(boolean pseudoCanvas);
}
