package com.indvd00m.ascii.render.elements.plot.misc;

import com.indvd00m.ascii.render.elements.plot.api.IPlotPoint;


public class PlotPoint implements IPlotPoint {

	protected double x;
	protected double y;

	public PlotPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}

}
