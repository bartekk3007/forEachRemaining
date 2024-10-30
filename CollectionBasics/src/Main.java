import java.util.ArrayList;
import java.util.Collection;

public class Main
{
    public static void main(String[] args)
    {
        Collection<String> collection = new ArrayList<>();
        collection.add("Andrzej");
        collection.add("Bartek");
        collection.add("Jan");
        var iterator = collection.iterator();
        iterator.next();
        iterator.next();

        Modifier modifier = new Modifier();
        iterator.forEachRemaining(modifier);
        for (var elem : collection)
        {
            System.out.println(elem);
        }
    }
}