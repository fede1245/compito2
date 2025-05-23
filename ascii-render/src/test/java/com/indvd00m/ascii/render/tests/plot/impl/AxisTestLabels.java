package com.indvd00m.ascii.render.tests.plot.impl;

import com.indvd00m.ascii.render.api.IRegion;
import com.indvd00m.ascii.render.elements.plot.AxisLabels;
import com.indvd00m.ascii.render.elements.plot.api.IPlotPoint;

import java.util.List;


public class AxisTestLabels extends AxisLabels {

	public AxisTestLabels(List<IPlotPoint> points, IRegion region, int countX, int countY) {
		super(points, region, countX, countY);
	}

	public AxisTestLabels(List<IPlotPoint> points, IRegion region) {
		super(points, region);
	}

}
