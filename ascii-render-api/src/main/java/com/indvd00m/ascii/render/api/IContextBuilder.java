package com.indvd00m.ascii.render.api;

import java.util.List;


public interface IContextBuilder {


	IContext build();


	IContextBuilder width(int width);


	IContextBuilder height(int height);


	IContextBuilder layer();


	IContextBuilder layer(IRegion region);


	IContextBuilder layer(int x, int y, int width, int height);


	IContextBuilder layer(IElement... elements);


	IContextBuilder layer(IRegion region, IElement... elements);


	IContextBuilder layer(int x, int y, int width, int height, IElement... elements);


	IContextBuilder layer(List<IElement> elements);


	IContextBuilder layer(IRegion region, List<IElement> elements);


	IContextBuilder layer(int x, int y, int width, int height, List<IElement> elements);



	IContextBuilder opacity(boolean opacity);


	IContextBuilder element(IElement element);


	IContextBuilder elements(IElement... elements);

	IContextBuilder elements(List<IElement> elements);

}
