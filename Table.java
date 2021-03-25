import java.util.Scanner;

public class Table {
  int width = 4;
  int height = 4;

  public Table(int input_width, int input_height) {
    width = input_width;
    height = input_height;
  }

  public String getNumbers() {
    int value = 1;
    String table = "";

    for (int i = 1; i <= height; i++) {
      table = table + "|";

      for (int j = 1; j <= width; j++) {

        table = table + "  " + value;
        if (value < 10) {
          table = table + "  |";
        } else {
          table = table + " |";
        }
        value++;

      }
      table = table + "\n";
    }
    return table;

  }
}