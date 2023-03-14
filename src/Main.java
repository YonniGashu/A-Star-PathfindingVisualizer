import Components.Grid;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("A* Pathfinding Visualizer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(new Grid());
        window.pack();
        window.setVisible(true);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

    }
}

