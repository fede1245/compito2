package com.indvd00m.ascii.render.api;

import java.util.List;

public interface ILayer {

	IRegion getRegion();


	List<IElement> getElements();


	boolean isOpacity();

}
