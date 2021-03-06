import java.awt.*;

public class GameExample extends GameEngine
{
    GemCard card = new GemCard(1, 4, 2, 1, 1, 2, 3);
    GemCard card2 = new GemCard(2, 0, 2, 4, 0, 0, 2);
    GemCard card3 = new GemCard(3, 1, 0, 4, 0, 2, 2);


    public GameExample()
    {
        super("Example",800, 600);
        setBackground(Color.GRAY);
        card2.setXY(155, 0);
        card3.setXY(310, 0);

        System.out.println(card.GetColorValue(ColorCost.Blue));
    }

    public void update()
    {
    }

    public void draw(Graphics g)
    {
        card.draw(g);
        card2.draw(g);
        card3.draw(g);
    }

    public void processKey(int code, boolean pressed)
    {
        System.out.println(code + ":" + pressed);
    }

    public static void main(String[] args)
    {
        new GameExample();
    }
}
