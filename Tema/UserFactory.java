package Tema;

public class UserFactory {

    public enum UserType{
        Parent,
        Student,
        Assistant,
        Teacher
    }

    public static User getUser(UserType userType, String prenume, String nume){
        switch (userType){
            case Parent:
                return new Parent(prenume, nume);
            case Student:
                return new Student(prenume, nume);
            case Assistant:
                return new Assistant(prenume, nume);
            case Teacher:
                return new Teacher(prenume, nume);
        }
        throw new IllegalArgumentException("The user type " + userType + " is not recognized");
    }

}
