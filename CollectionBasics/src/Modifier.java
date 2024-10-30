import java.util.function.Consumer;

public class Modifier implements Consumer
{

    @Override
    public void accept(Object o)
    {
        if(o instanceof String s)
        {
            s = s + "Polska";
        }
        else
        {
            throw new RuntimeException();
        }
    }
}