import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class learning extends JFrame {

  public learning(){
      setTitle("java graphics");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500,500);
      setVisible(true);

  }
  public void paint(Graphics g){
      Dimension siz=getSize();
for(int i=1;i<=500;i++) {
    g.setFont(new Font("tahoma",Font.BOLD,30));
    int x=0;
    while(x<=1000){
        x++;
        Random rnd=new Random();
        int R=rnd.nextInt(255);
        int G=rnd.nextInt(255);
        int B=rnd.nextInt(255);

        g.setColor(new Color(R,G,B));
        g.drawString("Hi all",60,60);
    }
}


  }
  public static void main(String args[]){
      new learning();
  }
}
