package class23_WrapperClas;

public class class23_parse_Exercise {
    public static void main(String[] args) {
        String values = "Acme.inc..,123456.78, 7890.12, 3456.78\n"+
                "Clobex corporation, 98765.32, 5432.10, 2109.87\n"+
                "Initeck Industries, 8976.32, 9087.34, 3456.44";
        Double num = 5.0;
        double num1 = num;
        System.out.println(num1);

        String str = "558";
        int num2 = Integer.parseInt(str);
        num2+=2;
        System.out.println(num2);
        String str2 = Integer.toString(num2);
        System.out.println("this is my day salary " + str2);

        String str4 = "this is my salary: 5000";
        String str5 = "this is my monthly expenses: 4500";
        double tm7 = Double.parseDouble(str4.substring(str4.indexOf(":")+2,str4.length()));
        int num4 = Integer.parseInt(str4.substring(str4.indexOf(":")+2,str4.length()));
        int num5 = Integer.parseInt(str5.substring(str5.indexOf(":")+2,str5.length()));
        int sum = num4+num5;
       System.out.println(num4+"\n"+num5+"\n"+"the sum of two numbers is: " + sum);

       System.out.println(num5 + sum);
       System.out.println(tm7);



        }
    }

