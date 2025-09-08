// Practice for Object-Oriented Programming (OOP)

import java.util.ArrayList;

class Staff {
    String name;
    int age;

    Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Practice01 {

    public static void printAllStaff(ArrayList<Staff> staffs) {
        for (int i = 0; i < staffs.size(); i++) {
            Staff staffList = staffs.get(i);
            staffList.printInfo();
        }
    }

    public static ArrayList<Staff> saveStaff() {
        ArrayList<Staff> staffList = new ArrayList<>();

        staffList.add(new Staff("Kim", 20));
        staffList.add(new Staff("Takahashi", 23));
        staffList.add(new Staff("Yamada", 30));

        return staffList;
    }

    public static void main(String[] args) {
        ArrayList<Staff> staffs = saveStaff();
        printAllStaff(staffs);
    }
}
