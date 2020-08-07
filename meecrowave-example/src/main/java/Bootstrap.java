import org.apache.meecrowave.Meecrowave;

import java.util.Scanner;

public class Bootstrap
{
    public static void main(String[] args)
    {
        Meecrowave.Builder builder = new Meecrowave.Builder();
        builder.setHttpPort(9999);

        try (final Meecrowave meecrowave = new Meecrowave(builder).bake())
        {
            new Scanner(System.in).nextLine();
        }
    }
}