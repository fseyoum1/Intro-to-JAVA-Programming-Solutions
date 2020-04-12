public class ExerciseString {

    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "welcome";


        //boolean isEqual = (s1.equals(s2)) ? true : false;
        boolean isEqual = (s1.equalsIgnoreCase(s2)? true : false);

        //int compareValue = s1.compareTo(s2);
        int compareValue = s1.compareToIgnoreCase(s2);

        boolean b 

        System.out.println("compare to " + compareValue);

        System.out.println(isEqual);

    }





}


