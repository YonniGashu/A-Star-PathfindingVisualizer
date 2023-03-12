package Components;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Node extends JButton implements ActionListener {
    int fCost;
    int gCost;
    int hCost;
    int row;
    int col;
    boolean startNode;
    boolean goalNode;

    public Node(int row, int col){
        this.row = row;
        this.col = col;
        this.setBorderPainted(true);
        addActionListener(this);
    }


    public void setGoalNode(){
        setBackground(Color.green);
        setOpaque(true);
        setBorder(new LineBorder(Color.BLACK, 4, true));
        removeActionListener(this);
    }

    public void setStartNode(){
        setBackground(Color.red);
        setOpaque(true);
        setBorder(new LineBorder(Color.BLACK, 4, true));
        removeActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.blue);
        setOpaque(true);
        setBorder(new LineBorder(Color.BLACK, 4, true));
    }
}
