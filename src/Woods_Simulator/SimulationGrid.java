


import java.awt.Image;

public class SimulationGrid {
	
	private int xOffset, yOffset, cellWidth, cellHeight, x, y;
	private Image tile, character = null;
	private int objnum;
	
	public SimulationGrid(Image img, int x, int y, int a, int b, int xx, int yy, int count) {
		this.tile = img;
		this.xOffset = x;
		this.yOffset = y;
		this.cellWidth = a;
		this.cellHeight = b;
		this.x = xx;
		this.y = yy;
		this.objnum = count;
	}
	public SimulationGrid(Image img, Image cha, int x, int y, int a, int b, int xx, int yy, int count) {
		this.tile = img;
		this.character = cha;
		this.xOffset = x;
		this.yOffset = y;
		this.cellWidth = a;
		this.cellHeight = b;
		this.x = xx;
		this.y = yy;
		this.objnum = count;
	}

	/**
	 * @return the xOffset
	 */
	public int getxOffset() {
		return xOffset;
	}

	/**
	 * @param xOffset the xOffset to set
	 */
	public void setxOffset(int xOffset) {
		this.xOffset = xOffset;
	}

	/**
	 * @return the yOffset
	 */
	public int getyOffset() {
		return yOffset;
	}

	/**
	 * @param yOffset the yOffset to set
	 */
	public void setyOffset(int yOffset) {
		this.yOffset = yOffset;
	}

	/**
	 * @return the cellWidth
	 */
	public int getCellWidth() {
		return cellWidth;
	}

	/**
	 * @param cellWidth the cellWidth to set
	 */
	public void setCellWidth(int cellWidth) {
		this.cellWidth = cellWidth;
	}

	/**
	 * @return the cellHeight
	 */
	public int getCellHeight() {
		return cellHeight;
	}

	/**
	 * @param cellHeight the cellHeight to set
	 */
	public void setCellHeight(int cellHeight) {
		this.cellHeight = cellHeight;
	}

	/**
	 * @return the img
	 */
	public Image getTile() {
		return tile;
	}

	/**
	 * @param img the img to set
	 */
	public void setTile(Image img) {
		this.tile = img;
	}

	/**
	 * @return the character
	 */
	public Image getCharacter() {
		return character;
	}

	/**
	 * @param character the character to set
	 */
	public void setCharacter(Image character) {
		this.character = character;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the objnum
	 */
	public int getObjnum() {
		return objnum;
	}
	public void addObjnum(int i) {
		this.objnum = i;
	}
	/**
	 * @param objnum the objnum to set
	 */
	/**
	 * @param check if the current tile has a character on it.
	 */
	public boolean containCharacter() {
		if(this.character != null) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString(){
		return "xOffset: "+this.xOffset+" yOffset: "+this.yOffset+" cellWidth: "+this.cellWidth+" cellHeight: "+this.cellHeight+" Object Number: "+objnum;
	}

}
