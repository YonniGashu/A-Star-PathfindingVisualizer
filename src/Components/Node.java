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
        setFocusable(true);
        setEnabled(true);
        requestFocusInWindow();
        setRolloverEnabled(true);
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

    public static boolean isKeyPressed(KeyEvent e, int keyCode) {
        return (e.getKeyCode() == keyCode && e.getID() == KeyEvent.KEY_PRESSED);
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        if (getModel().isEnabled() && getModel().isRollover()) {
//            setBackground(Color.BLUE);
//        }else{
//            System.out.println(getModel().isRollover());
//        }
        checkEvent(e);
    }

    public void checkEvent(InputEvent inputEvent){
        if(inputEvent.getID() == KeyEvent.KEY_PRESSED && inputEvent.getID() == MouseEvent.MOUSE_ENTERED) {
            System.out.println("yo");
        }
    }

    MouseAdapter ma = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
//            if (e.getSource() == Node.this && getModel().isEnabled() &&  isKeyPressed(, KeyEvent.VK_E)) {
                  checkEvent(e);
//                setBackground(Color.RED);
//            }
        }

        @Override
        public void mouseExited(MouseEvent event) // Or any other mouse event handler...
        {
            int buttonsDownMask = MouseEvent.BUTTON1_DOWN_MASK;
            if ((event.getModifiersEx() & buttonsDownMask) != 0 ){
                setBackground(Color.blue);
                setOpaque(true);
                setBorder(new LineBorder(Color.BLACK, 4, true));
                removeActionListener(Node.this);
                removeKeyListener(Node.this);
                removeMouseListener(ma);
            }
        }
    };

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
