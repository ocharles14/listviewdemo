package fr.caensup.lsts.smb116.demolistview;

public class Model {

    private static final  int MAX_ROW = 10;
    private static final int MAX_COL = 10;
    private static final int MAX_NUM = 100;

    private int[][] mat = new int[MAX_ROW][MAX_COL];

    public Model() {
        for(int i = 0; i< MAX_ROW; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                mat[i][j] = (int) (Math.random() * MAX_NUM);
                System.out.print("\t" + mat[i][j]);
            }
            System.out.println();
        }
    }

    public int getNumber( int i, int j) {
        // PRECONDITION
        if ( i<0 || i>= MAX_ROW || j<0 || j>=MAX_COL ) {
            throw new IllegalArgumentException("i or j out of bounds");
        }
        return mat[i][j];
    }

    public void setNUmber( int i, int j , int number ) {
        if ( i<0 || i>= MAX_ROW || j<0 || j>=MAX_COL ) {
            throw new IllegalArgumentException("i or j out of bounds");
        }
        mat[i][j] = number;
    }

    public int getCount() {
        return MAX_ROW *MAX_COL;
    }

    public int getRowCount() {
        return MAX_ROW;
    }

    public int getColCount() {
        return MAX_COL;
    }

}
