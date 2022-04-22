import java.util.Scanner;

public class person {
    public String name;
    protected int phoneNumber;
    int age;
    private int weight;

    person(String Name, int PhoneNumber, int Age, int Weight){
        name = Name;
        phoneNumber = PhoneNumber;
        age = Age;
        weight = Weight;

    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name : ");
        String name = scanner.nextLine();
        System.out.print("phone_number : ");
        int phonenumber = scanner.nextInt();
        System.out.print("age : ");
        int age = scanner.nextInt();
        System.out.print("weight : ");
        int weight = scanner.nextInt();


    }
}


