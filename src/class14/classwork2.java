package class14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class classwork2 {
    /**
     * You are given a list of integers, and an integer
     * Write a function that moves all instances of that integer in the list to the end of the list and return the list
     * The function should perform this in place (i.e., it should mutate the input array),
     * and doesn't need to maintain the order of the other integers.
     *
     * ex:
     * input:
     * array = [2,1,2,2,2,3,4,2]
     * toMove = 2
     *
     * output: [1,3,4,2,2,2,2,2] //the numbers 1, 3 and 4 could be ordered differently
     */

        public static void main(String[] args) {
            List<Integer> in = new ArrayList<>(Arrays.asList(5,5,5,5,6,5));
            System.out.println( moveIt(in, 5));
        }
        public  static List<Integer> moveIt(List<Integer> input, int toMove){


            for(int i =0; i < input.size(); i++){
                if(input.get(i) == toMove){
                    input.add(input.get(i));
                    input.remove(input.get(i));
                }
            }

            return input;

        }
    }

