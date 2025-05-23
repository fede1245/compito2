
/**
 * @author Federico Verzi
 */
package com.indvd00m.ascii.render;

import com.indvd00m.ascii.render.api.IRegion;

/**
 * classe publica implementata
 */
public class Region implements IRegion {

	protected int x;
	protected int y;
	protected int width;
	protected int height;

	public Region(int x, int y, int width, int height) {
		super();
		if (width < 0) {
			throw new IllegalArgumentException();
		}
		if (height < 0) {
			throw new IllegalArgumentException();
		}
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	/**
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Region other = (Region) obj;
		if (height != other.height) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Region [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append("]");
		return builder.toString();
	}

}
