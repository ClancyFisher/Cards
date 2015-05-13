import java.awt.*;

public class GemCard
{
    // width = 150
    // height = 210
    // instance variables
    // 1 = blue, 2 = red, 3 = green, 4 = white, 5 = black
    
    
    int m = 1;

    int vp = 4;

    int costbl = 2;
    int costg = 2;
    int costw = 2;
    int costr = 2;
    int costba = 2;
    int[] colors = new int[5];
    int x = 0, y = 0;

    public GemCard(int m, int vp, int bl, int gr, int wh, int re, int ba)
    {
        this.m = m;
        this.vp = vp;
        this.colors[0] = bl;
        
        costbl = bl;
        costg = gr;
        costw = wh;
        costr = re;
        costba = ba;
        
        System.out.println();
    }
    ///dfdffd
    public int GetColorValue(ColorCost color)
    {
        switch(color){
            case Blue:
                    return colors[0];
               default:
                    return -1;
        }
    }
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics g)
    { 
        int y = this.y + 175;
        g.setColor(Color.WHITE);

        // ref x = 50
        // ref y = 45

        Graphics2D g2d = (Graphics2D) g;
        Color red = new Color(255, 137,137,255);
        Color blue = new Color(145, 206,253,255);
        Color green = new Color(142, 199,253,147);
        Color white = new Color(196, 196,196,147);
        Color black = new Color(76, 76,76,147);

        switch(m)
        {
            case 1:
            g.setColor(blue); break;
            case 2:
            g.setColor(red); break;
            case 3:
            g.setColor(green); break;
            case 4:
            g.setColor(white); break;
            case 5:
            g.setColor(black); break;
        }

        g2d.fillRoundRect(this.x, this.y, 150, 210, 10, 10);

        /*
        g.fillRect(50, 50, 150, 200);
        g.fillOval(50, 45, 10, 10);
        g.fillOval(189, 45, 10, 10);
        g.fillOval(50, 245, 10, 10);
        g.fillOval(189, 245, 10, 10);
        g.fillRect(55, 45, 140, 30);
        g.fillRect(55, 226, 140, 30);
         */

        switch(m)
        {
            case 1:
            g.setColor(Color.BLUE); break;
            case 2:
            g.setColor(Color.RED); break;
            case 3:
            g.setColor(Color.GREEN); break;
            case 4:
            g.setColor(Color.WHITE); break;
            case 5:
            g.setColor(Color.BLACK); break;
        }
        g.fillOval(this.x+5,this.y+5,20,20);

        g.setColor(Color.BLACK);
        g.setFont(new Font("default", Font.BOLD, 16));
        g.drawString(""+vp,this.x + 130,this.y + 20);

        if(costbl >= 1){
            g.setColor(Color.BLUE);
            g.fillOval(this.x + 5,y,30,30);  
            g.setColor(Color.WHITE);
            g.drawString(""+ costbl,this.x + 16,y+20);
            y -= 32;
        }
        if(costr >= 1){
            g.setColor(Color.RED);
            g.fillOval(this.x + 5,y ,30,30);  
            g.setColor(Color.WHITE);
            g.drawString(""+ costr,this.x + 16,y+20);
            y -= 32;
        }
        if(costw >= 1){
            g.setColor(Color.WHITE);
            g.fillOval(this.x + 5,y,30,30); 
            g.setColor(Color.BLACK);
            //g.drawOval(this.x + 5,y,30,30);
            g.drawString(""+ costw,this.x + 16,y+20);
            y-= 32;
        }
        if(costg >= 1){
            g.setColor(Color.GREEN.darker());
            g.fillOval(this.x + 5,y,30,30);  
            g.setColor(Color.WHITE);
            g.drawString(""+ costg,this.x + 16,y+20);
            y-=32;
        }
        if(costba >= 1){
            g.setColor(Color.BLACK);
            g.fillOval(this.x + 5,y,30,30);  
            g.setColor(Color.WHITE);
            g.drawString(""+ costba,this.x + 16,y+20);
            y-=32;
        }
    }
}
