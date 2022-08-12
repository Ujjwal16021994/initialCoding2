package com.ujjwal;

public class PrintAllUniqueWordsPresentInTheString {
    public static void main(String args[]) {
        String input="the sun rises in the east";
        countWords(input);
    }
    static void countWords(String st)  {
        String[] words = st.split("\\s");
        for (int i = 0; i < words.length; i++)
        {
            for (int j = i+1; j < words.length; j++)
            {
                if (words[i].equals(words[j]))
                {
                    if (i != j)
                        words[i] = "";
                    words[j] = "";

                }
            }
        }


        for (int i = 0; i < words.length; i++){

            if (words[i] != ""){
                System.out.print(words[i]+" " );

            }
        }
    }
}
