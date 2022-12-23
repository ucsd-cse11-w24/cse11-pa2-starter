class CompileTimeErrors{
    int checkNumber(double number){
        if (number > 0){
            return "The number " + number " is positive.";
        }
        else if ("number" < 0){ 
            return "The number " + number + " is negative."; 
        }
        return The number is zero.;
    }
    String answer1 = checkNumber(1);
    String answer2 = checkNumber("0"); 
    double answer3 = checkNumber(-10.5); 
}
