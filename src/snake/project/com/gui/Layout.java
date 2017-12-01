package snake.project.com.gui;

import snake.project.com.architecture.Game;
import snake.project.com.architecture.Point;
import snake.project.com.creatures.Food;
import snake.project.com.creatures.Wall;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Layout extends JPanel {

  private final Game game;
  private final int cellSize;

  public Layout(Game game, int cellSize) {
    this.game = game;
    this.cellSize = cellSize;
    setBackground(Color.BLACK);
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    if (game.isOver()) {
      String str = "Game Over";
      g.setColor(Color.white);
      g.drawString(str, game.getMap().Width * cellSize / 2 - 40 , game.getMap().Height * cellSize / 2);
    } else {
      Food food = game.getFood();
      Wall wall = game.getWall();
      List<Point> snakeCoordinates = game.getSnake().getListCoordinates();
      g.setColor(Color.RED);
      g.fillRect(food.getCoordinates().getX() * cellSize, food.getCoordinates().getY() * cellSize, cellSize, cellSize);
      g.setColor(Color.DARK_GRAY);
      g.fillRect(wall.getCoordinates().getX() * cellSize, wall.getCoordinates().getY() * cellSize, cellSize, cellSize);
      g.setColor(Color.GREEN);
      for (Point coordinate : snakeCoordinates) {
        g.fillRect(coordinate.getX() * cellSize, coordinate.getY() * cellSize, cellSize, cellSize);
      }
    }
  }
}
