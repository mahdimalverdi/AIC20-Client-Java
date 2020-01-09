package Client.Model;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private int row;
    private int col;
    private List<Unit> unitList = new ArrayList<>();

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public List<Unit> getUnitList() {
        return unitList;
    }

    public void setUnitList(List<Unit> unitList) {
        this.unitList = unitList;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
