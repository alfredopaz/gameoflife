package epis.unsa;
import java.util.*;
public class Board{
  private boolean[][] board;
  public Board(int width, int height, List<Point> points){
    board = new boolean[height][width];
    setInitialState(points);
  }
  public int getWidth(){
  }
  public int getHeight(){
  }
  private Board(boolean[][] board) {
  }
  public boolean cell(int i, int j){
  }
  private void setInitialState(List<Point> points){
  }
  public int countNeighbors(int x, int y){
  }
  public Board nextState(){
  }
}
