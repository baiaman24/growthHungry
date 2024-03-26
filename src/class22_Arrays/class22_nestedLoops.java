package class22_Arrays;

public class class22_nestedLoops {
    public static void main(String[] args) {
        String[] array = {"Heeloo", "Salam Aleikum","You are the best"};
        int total = 0;
        for (int i = 0; i < array.length; i++ ){
            int counter = 0;
            for(int l = 0; l < array[i].length(); l++){

                switch(array[i].toLowerCase().charAt(l)){
                    case 'a':
                    case 'e':
                    case 'y':
                    case 'u':
                    case 'i':
                    case 'o':
                        counter++;
                    System.out.print(array[i].charAt(l)+ " ");
                }
            } System.out.print(counter + "\n");
            total+=counter;
        } System.out.print("\n" + total);
    }
}
