
public class Application {
    public static void main(String[] args) {
        int value = 7;
        // initiallize the array
        int[] values;
        values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        // another way to initiallise array
        int[] numbers = { 5, 6, 7 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        //initialize string arrays
        
        String[] words = new String[3];
        
        words[0] ="hello";
        words[1] ="to";
        words[2] ="you";
        
        System.out.println(words[2]);
        
        String[] fruits = {"apple", "banana", "pear", "kiwi"};
        
        for(String fruit: fruits) {
        	System.out.println(fruit);
        }
    }
}
