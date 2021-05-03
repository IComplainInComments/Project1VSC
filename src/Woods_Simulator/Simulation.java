
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.net.URL;

/**
 *
 * @author edward Modified Code based from:
 * https://stackoverflow.com/questions/15421708/how-to-draw-grid-using-swing-class-java-and-detect-mouse-position-when-click-and
 */
public class Simulation extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1576422795369797050L;

    private int columnCount = 2;
    private int rowCount = 2;
    private final List<SimulationGrid> cells;
    private int count = 0;

    public Simulation(int x, int y) {
        cells = new ArrayList<>(columnCount * rowCount);
        rowCount = x;
        columnCount = y;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1192, 600);
    }

    @Override
    public void invalidate() {
        cells.clear();
        super.invalidate();
        this.count = 0;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();
        int sqrDim;
        if((width/columnCount)<(height/rowCount))
             sqrDim = width/columnCount;
        else
             sqrDim = height/rowCount;
        System.out.println("Draw called");
        System.out.println(this.rowCount);
        System.out.println(this.columnCount);
        generateGrid();
        cells.forEach(cell -> {
        	//cell.setCharacter(giveCharacter());
        	if(cell.containCharacter()) {
        		g2d.drawImage(cell.getTile(), cell.getxOffset(),cell.getyOffset(),cell.getCellWidth(),cell.getCellHeight(),this);
        		g2d.drawImage(cell.getCharacter(), (int)Math.floor(sqrDim*.2) + cell.getxOffset(), (int) (Math.floor(sqrDim*.1)) + cell.getyOffset(),(int)Math.floor(sqrDim*.6),(int)Math.floor(sqrDim*.85),this);
        	} else {
        		g2d.drawImage(cell.getTile(), cell.getxOffset(),cell.getyOffset(),cell.getCellWidth(),cell.getCellHeight(),this);
        	}
        });
        g2d.dispose();
    }
    public void generateGrid() {
        int width = getWidth();
        int height = getHeight();
        int sqrDim;
        if((width/columnCount)<(height/rowCount))
             sqrDim = width/columnCount;
        else
             sqrDim = height/rowCount;
        int cellWidth = sqrDim;
        int cellHeight = sqrDim;

        int xOffset = (width - (columnCount * cellWidth)) / 2;
        int yOffset = (height - (rowCount * cellHeight)) / 2;

        if (cells.isEmpty()) {
            for (int row = 0; row < rowCount; row++) {
                for (int col = 0; col < columnCount; col++) {
                	count++;
                	cells.add(new SimulationGrid(giveTile(),
                			xOffset + (col * cellWidth),
                			yOffset + (row * cellHeight),
                			cellWidth,
                			cellHeight,
                			row,
                			col,
                			count));
                }
            }
        }
    }
	public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
        System.out.println("Method: "+this.columnCount);
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
        System.out.println("Method: "+rowCount);
    }
    public void modifyTileImg(int x, int y) {
    	System.out.println("Modified 1 Called");
    	SimulationGrid tile = null;
    	for(int i = 0; i < cells.size(); i++) {
    		tile = cells.get(i);
    		if(tile.getX() == x && tile.getY() == y) {
    			if(tile.containCharacter()) {
    				insertCharacter(tile.getObjnum()-1, tile.getCharacter());
    			} else {
    				insertCharacter(tile.getObjnum()-1, giveCharacter());
    			}
    		}
    	}
    }
    public Image getCharacter(int x, int y) {
    	System.out.println("Modified 1 Called");
    	SimulationGrid tile = null;
    	for(int i = 0; i < cells.size(); i++) {
    		tile = cells.get(i);
    		if(tile.getX() == x && tile.getY() == y) {
    			if(tile.containCharacter()) {
    				return tile.getCharacter();
    			} else {
    				return null;
    			}
    		}
    	}
    	return null;
    }
    public void modifyTileImg(int x, int y, int prevX, int prevY) {
    	System.out.println("Moving character method");
    	SimulationGrid tile = null;
    	SimulationGrid prevTile = null;
    	Image temp = null;
    	int objnum = -1;
    	for(int i = 0; i < cells.size(); i++) {
    		tile = cells.get(i);
    		prevTile = cells.get(i);
    		if(prevTile.getX() == prevX && prevTile.getY() == prevY) {
    			temp = prevTile.getCharacter();
    			insertCharacter(tile.getObjnum()-1, null);
    		}
    		if(tile.getX() == x && tile.getY() == y) {
    			objnum = tile.getObjnum();
    		}
    		if(temp != null && objnum > -1) {
    			insertCharacter(objnum - 1, temp);
    			System.out.println("Moving character to: "+x+", "+y);
				objnum = -1;
    		}
    	}
    	temp = null;
    	tile = null;
    	prevTile = null;
    	objnum = -1;
    }
	public void modifyTileImg(int x, int y, int prevX, int prevY, Image cha) {
    	System.out.println("Moving character method");
    	SimulationGrid tile = null;
    	SimulationGrid prevTile = null;
    	Image temp = cha;
    	int objnum = -1;
    	for(int i = 0; i < cells.size(); i++) {
    		tile = cells.get(i);
    		prevTile = cells.get(i);
    		if(prevTile.getX() == prevX && prevTile.getY() == prevY) {
    			insertCharacter(tile.getObjnum()-1, null);
    		}
    		if(tile.getX() == x && tile.getY() == y) {
    			objnum = tile.getObjnum();
    		}
    		if(temp != null && objnum > -1) {
    			insertCharacter(objnum - 1, temp);
    			System.out.println("Moving character to: "+x+", "+y);
				objnum = -1;
    		}
    	}
    	temp = null;
    	tile = null;
    	prevTile = null;
    	objnum = -1;
    }
	/**
	 * @param Finds the Cell by it's image Object number and replaces the character,
	 *        be sure to call the methods invalidate() and repaint() to show the character,
	 *        after modifying the tile.
	 */
    public void insertCharacter(int tileNum, Image img) {
    	System.out.println("INSERTED CHARACTER AT: " + tileNum);
    	SimulationGrid tile = cells.get(tileNum);
    	tile.setCharacter(img);
    	cells.set(tileNum, tile);
    	this.repaint();
    }

	public Image giveTile() {
    	Image img = null;
    	try {
    		Random rn = new Random();
    		URL url = Simulation.class.getResource("/tiles/tile_"+rn.nextInt(7)+".png");
    	    img = ImageIO.read(url);
    	    return img;
    	} catch (IOException e) {
    		System.out.println("Image Asset Not Found");
    		return null;
    	}
    }
    public Image giveCharacter() {
    	Image img = null;
    	String name[] = {"Ben", "Eric", "Russell", "Will", "Edward", "Charlie"};
    	String dirc[] = {"N", "S", "E", "W", "NW", "NE", "SE", "SW"};
    	try {
    		Random rn = new Random();
    		URL url = Simulation.class.getResource("/allCharacters/"+name[rn.nextInt(6)]+"Run_"+dirc[rn.nextInt(8)]+".gif");
    	    img = ImageIO.read(url);
    	    return img;
    	} catch (IOException e) {
    		System.out.println("Image Asset Not Found");
    		return null;
    	}
    }
}
