/**
 * Auto Generated Java Class.
 */
public class Table {
  
  private int width;
  private int height;
  private int num;
  
  public  Table(){
    this.width = 6;
    this.height = 8;
    this.num = 1;
  }
  
  public void setwidth(int width){
    this.width = width;
  }
  
  public void setheight(int height){
    this.height = height;
  }
  
  public int getwidth(){
    return width;
  }
  
  public int getheigth(){
    return height;
  }
  
  public void getNumber()
  {
   for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if(num<10)
                {
                System.out.print("|   "+num+ "    ");
                num++;
                }else{
                System.out.print("|   "+num+ "   ");
                num++;
                }
                
            } 
            System.out.print("|\n");
        }
   return;
  }
  

}
