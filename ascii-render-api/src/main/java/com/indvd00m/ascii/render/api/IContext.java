package com.indvd00m.ascii.render.api;

import java.util.List;


public interface IContext {


	int getWidth();


	int getHeight();

	List<ILayer> getLayers();


	<E extends IElement> E lookup(Class<E> clazz);


	<E extends IElement> E lookup(Class<E> clazz, boolean includeSuccessors);


	<E extends IElement> List<E> lookupAll(Class<E> clazz);


	<E extends IElement> List<E> lookupAll(Class<E> clazz, boolean includeSuccessors);


	<E extends IElement> E lookup(Class<E> clazz, ILayer layer);


	<E extends IElement> E lookup(Class<E> clazz, boolean includeSuccessors, ILayer layer);


	<E extends IElement> List<E> lookupAll(Class<E> clazz, ILayer layer);


	<E extends IElement> List<E> lookupAll(Class<E> clazz, boolean includeSuccessors, ILayer layer);


	ILayer lookupLayer(IElement element);


	List<ILayer> lookupLayers(IElement element);


	<T extends ITypedIdentified<T>> T lookupTyped(Class<T> type, int typedId);


	<T extends ITypedIdentified<T>> T lookupTyped(Class<T> type, int typedId, boolean includeSuccessors);


	<T extends ITypedIdentified<T>> List<T> lookupTyped(Class<T> type);


	<T extends ITypedIdentified<T>> List<T> lookupTyped(Class<T> type, boolean includeSuccessors);


	boolean contains(IElement element);


	IPoint transform(IPoint point, ILayer source, ILayer target);


	IPoint transform(IPoint point, IElement source, IElement target);

}
