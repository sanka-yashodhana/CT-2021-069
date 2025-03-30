package Q_04;
class Owner {
    private String ownerName;
    private String phoneNo;

    // Constructors
    public Owner() {
        this.ownerName = "Unknown";
        this.phoneNo = "";
    }

    public Owner(String name, String num) {
        this.ownerName = name;
        this.phoneNo = num;
    }

    // Getters and Setters
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String num) {
        this.phoneNo = num;
    }
}
class Bicycle {

    private Owner owner;

    // Constructors
    public Bicycle() {
        this.owner = new Owner();
    }

    public Bicycle(String name, String num) {
        this.owner = new Owner(name, num);
    }


    public String getOwnerName() {
        return owner.getOwnerName();
    }


    public void setOwnerName(String name) {
        owner.setOwnerName(name);
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }


    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
public class four {
    public static void main(String[] args) {

        Bicycle bike1 = new Bicycle();
        System.out.println("Bike1 Owner: " + bike1.getOwnerName());
        System.out.println("Bike1 Phone: " + bike1.getPhoneNo());


        Bicycle bike2 = new Bicycle("John Doe", "123-456-7890");
        System.out.println("Bike2 Owner: " + bike2.getOwnerName());
        System.out.println("Bike2 Phone: " + bike2.getPhoneNo());


        Owner owner = new Owner("Jane Smith", "987-654-3210");
        Bicycle bike3 = new Bicycle();
        bike3.setOwner(owner);
        System.out.println("Bike3 Owner: " + bike3.getOwnerName());
        System.out.println("Bike3 Phone: " + bike3.getPhoneNo());
    }
}