package Components;

import javax.swing.*;
import java.awt.*;

public class Grid extends JPanel {
    //GRID SETTINGS
    int nodeSize = 70;
    int maxRows = 10;
    int maxCols = 20;
    int screenWidth = nodeSize * maxCols;
    int screenHeight = nodeSize * maxRows;

    //ARRAY OF NODES
    Node[][] node = new Node[maxCols][maxRows];

    public Grid(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(maxRows, maxCols));

        int row = 0;
        int col = 0;

        for(int i = 0; i < maxRows; i++){
            for(int j = 0; j < maxCols; j++){
                node[j][i] = new Node(j,i);
                this.add(node[j][i]);
                col++;
            }
            if(col == maxCols){
                col = 0;
                row++;
            }
        }

//        node[0][0].setStartNode();
//        node[10][9].setGoalNode();
    }
}
