class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
class Vote{
    int age;
    public Vote(int age) throws InvalidAgeException{
        if(age < 18) {
            throw new InvalidAgeException("Invalid Age " + age);
        }else{
            System.out.println("You Can Vote");
        }
    }

}
public class TestUserExceptionClass {
    public static void main(String[] args) {
        try{
            Vote voter = new Vote(10);
        } catch (InvalidAgeException e){
            System.out.println("Exception"+e);
        }
    }
}
