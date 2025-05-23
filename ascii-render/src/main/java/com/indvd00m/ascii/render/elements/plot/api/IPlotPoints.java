package com.indvd00m.ascii.render.elements.plot.api;

import java.util.List;


public interface IPlotPoints {

	List<IPlotPoint> getPoints();

	double getMaxX();

	double getMaxY();

	double getMinX();

	double getMinY();

	double getDiffX();

	double getDiffY();

	List<IPlotPoint> normalize(double maxX, double maxY);

}