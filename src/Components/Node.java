package Components;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Node extends JButton implements ActionListener, KeyListener{
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
        addKeyListener(this);
        addMouseListener(ma);
    }


    public void setGoalNode(){

        setBackground(Color.green);
        setOpaque(true);
        setBorder(new LineBorder(Color.BLACK, 4, true));
        goalNode = true;
        //REMOVE ALL LISTENERS
        removeActionListener(this);
        removeKeyListener(this);
        removeMouseListener(ma);
    }

    public void setStartNode(){
        setBackground(Color.red);
        setOpaque(true);
        setBorder(new LineBorder(Color.BLACK, 4, true));
        startNode = true;
        //REMOVE ALL LISTENERS
        removeActionListener(this);
        removeKeyListener(this);
        removeMouseListener(ma);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.blue);
        setOpaque(true);
        setBorder(new LineBorder(Color.BLACK, 4, true));
        //REMOVE ALL LISTENERS
        removeActionListener(this);
        removeKeyListener(this);
        removeMouseListener(ma);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_E){
            System.out.println("yur");
            setStartNode();
        }
        if(e.getKeyCode() == KeyEvent.VK_Q){
            System.out.println("bru");
            setGoalNode();
        }
    }

    MouseAdapter ma = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            setBackground(Color.yellow);
            super.mouseEntered(e);
        }
    };

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
