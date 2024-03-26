package class14;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class class14_1 {
    public static void main(String[] args){
        String input = " bkjbjkhb KJBj Jbkjb 213454 /.,';";
            if(input.contains("*")){
                System.out.println(" ");
            } else{
                Set<Character> upperCaseLetters = new TreeSet<>();
                Set<Character> lowerCaseLetters = new TreeSet<>();
                Set<Character> digits = new TreeSet<>();
                Set<Character> symbols = new TreeSet<>();
                Set<Character> allCombined = new LinkedHashSet<>();

                for(int i = 0; i < input.length(); i++){
                    char currentChar  = input.charAt(i);
                    char upperCase = Character.toUpperCase(currentChar);

                    if(Character.isLetter(currentChar)){

                        if(currentChar == upperCase){
                            upperCaseLetters.add(currentChar);
                        } else{
                            lowerCaseLetters.add(currentChar);
                        }

                    } else if(Character.isDigit(currentChar)){
                        digits.add(currentChar);
                    } else if(!Character.isWhitespace(currentChar)){
                        symbols.add(currentChar);
                    } else{

                    }
                }
                allCombined.addAll(upperCaseLetters);
                allCombined.addAll(lowerCaseLetters);
                allCombined.addAll(digits);
                allCombined.addAll(symbols);
                System.out.println(allCombined);
            }
        }
        }
