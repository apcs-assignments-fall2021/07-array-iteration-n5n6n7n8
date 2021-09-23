import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] newarr=new int[arr.length];
        int increment=0;
        for (int i = arr.length-1; i>-1; i--) {
            newarr[increment]=arr[i];
            increment++;
        }
        return newarr;
    }
    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};
        for(String x: dictionary)
        {
            if(word==x)
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{2,4,6,8,10,12})));
        System.out.println(secondLargest(new int[]{5,2,6,15,29,4,40,1,12}));
        System.out.println(spellCheck("each"));
        System.out.println(spellCheck("dolphin"));
    }
}
