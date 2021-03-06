package snake.gui;

import snake.architecture.Game;

import javax.swing.*;

public class GameWindow extends JFrame {


  public GameWindow(Game game, int cellSize) {
    setTitle("Змейка");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize((game.getMap().Width + 1)* cellSize + 16, (game.getMap().Height + 1)* cellSize + 38);
    setLocationRelativeTo(null);
    setResizable(false);
    setVisible(true);
  }

}
