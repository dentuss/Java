public class task1
{
    public static String spinWords(String sentence)
    {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];

            if (word.length() >= 5)
            {
                word = new StringBuilder(word).reverse().toString();
            }

            result.append(word);

            if (i < words.length - 1)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
