
/**
 * @author Federico Verzi
 */
package com.indvd00m.ascii.render;

import com.indvd00m.ascii.render.api.IElement;
import com.indvd00m.ascii.render.api.ILayer;
import com.indvd00m.ascii.render.api.IRegion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * crea una semplice classe ILayer implementata da Layer
 * per poi creare una lista protected, una regione e un booleano protected
 */
public class Layer implements ILayer {

	protected IRegion region;
	protected List<IElement> elements = new ArrayList<IElement>();
	protected boolean opacity;

	Layer(IRegion region) {
		super();
		this.region = region;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public IRegion getRegion() {
		return region;
	}

	@Override
	public List<IElement> getElements() {
		return Collections.unmodifiableList(elements);
	}

	@Override
	public boolean isOpacity() {
		return opacity;
	}

}
