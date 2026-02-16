import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        ArrayList<Rectangle> list = new ArrayList<>();

        list.add(new Rectangle(1, 1));
        list.add(new Rectangle(2, 1));
        list.add(new Rectangle(3, 1));
        list.add(new Rectangle(4, 1));
        list.add(new Rectangle(5, 1));
        list.add(new Rectangle(1, 5));
        list.add(new Rectangle(2, 4));
        list.add(new Rectangle(3, 3));
        list.add(new Rectangle(6, 1));
        list.add(new Rectangle(1, 6));

        BigRectangleFilter filter = new BigRectangleFilter();

        System.out.println("Rectangles with perimeter greater than ten:");

        for (Rectangle r : list)
        {
            if (filter.accept(r))
            {
                System.out.println("Rectangle width " + r.width + " height " + r.height);
            }
        }
    }
}