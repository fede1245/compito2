
/**
 * @author Federico Verzi
 */
package com.indvd00m.ascii.render;

import com.indvd00m.ascii.render.api.IPoint;

/**
 * crea una nuova classe implementata,
 */

public class Point implements IPoint {
	/**
	 * 2 interi protected
	 */
	protected int x;
	protected int y;

	/**
	 *
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public int getX() {
		return x;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public int getY() {
		return y;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Point other = (Point) obj;
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
		builder.append("Point [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}

}
