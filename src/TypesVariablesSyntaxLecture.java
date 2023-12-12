public class TypesVariablesSyntaxLecture {
    public static void main(String[] args) {
        System.out.println("This is an example of a statement.");
        System.out.println("Notice that it ends with a semicolon.");
        System.out.println("When we create statement: they MUST end with a semicolon.");
        System.out.println("Or Java gets mad at us...");

        /*
        * This is a multiline comment
        * It can go on for multiple lines.
        * Ain't that neat?
         */

        int smallNum = 19;
        System.out.println(smallNum);
        smallNum = 127;
        //int notAsSmallNum = smallNum;
        smallNum++;
        //notAsSmallNum++;
        System.out.println(smallNum);
        //System.out.println(notAsSmallNum);

        //int numDefault;
        //numDefault = 0; // You MUST set a value for a variable before accessing it. i.e.: no default value.
        //System.out.println(numDefault);

        char firstLetterOfRicky = 'R';
        System.out.println(firstLetterOfRicky);

        boolean isTrue = true;
        System.out.println(isTrue);

        String message = "I'm a string!";
        String quote = "\t\"Better out than in, I always say.\" - Shrek, but also Rick Jaimes?!";
        System.out.println(message);
        System.out.println(quote);

        final String EMPEROR_OF_IMUGI = "Ricky \"Lord Leatherneck\" Jaimes";

        // Casting Section of The Lecture
        byte tinyNum = 22;
        short stillSmallNum = (short) (tinyNum + 3);
        System.out.println(stillSmallNum);

        float almostPi = 3.14F; // Add a "F" to get rid of the error
        int almostAlmostPi = (int) almostPi;
        System.out.println(almostPi);
        System.out.println(almostAlmostPi);

        long bigNum = 200L;

    }
}
