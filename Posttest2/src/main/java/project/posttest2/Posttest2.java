package project.posttest2;
import project.HP.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public final class Posttest2 {
    public final static void main(String[] args) {
        ArrayList<Phone> phoneList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("========== Phone Management Menu ==========");
        System.out.println("1. Add Phone");
        System.out.println("2. View Phone List");
        System.out.println("3. Search Phone");
        System.out.println("4. Update Phone");
        System.out.println("5. Delete Phone");
        System.out.println("6. Exit");
        System.out.print("Please enter your choice (1-6): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Phone Name: ");
                    String phoneName = scanner.nextLine();
                    System.out.print("Enter Phone Brand: ");
                    String phoneBrand = scanner.nextLine();
                    System.out.print("Enter Phone Price: ");
                    double phonePrice = Double.parseDouble(scanner.nextLine());

                    Phone phone = new Phone(phoneName, phoneBrand, phonePrice);
                    phoneList.add(phone);
                    System.out.println("Phone added successfully!");
                    break;

                case "2":
                    if (phoneList.isEmpty()) {
                        System.out.println("Phone List is Empty");
                    } else {
                        System.out.println("Phone List:");
                        for (Phone p : phoneList) {
                            System.out.println(p);
                        }
                    }
                    break;

                case "3":
                    System.out.print("Enter the name of the phone to search: ");
                    String nameToSearch = scanner.nextLine();
                    boolean found = false;

                    for (Phone p : phoneList) {
                        if (p.getPhoneName().equalsIgnoreCase(nameToSearch)) {
                            System.out.println("Phone found:");
                            System.out.println(p);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Phone not found.");
                    }
                    break;

                case "4":
                    System.out.print("Enter the name of the phone to update: ");
                    String nameToUpdate = scanner.nextLine();
                    boolean foundToUpdate = false;

                    for (int i = 0; i < phoneList.size(); i++) {
                        Phone s = phoneList.get(i);
                        if (s.getPhoneName().equalsIgnoreCase(nameToUpdate)) {
                            System.out.print("Enter the new name: ");
                            String newName = scanner.nextLine();

                            System.out.print("Enter the new brand: ");
                            String newBrand = scanner.nextLine();

                            System.out.print("Enter the new price: ");
                            double newPrice = Double.parseDouble(scanner.nextLine());

                            Phone newPhone = new Phone(newName, newBrand, newPrice);

                            phoneList.set(i, newPhone);
                            System.out.println("Phone updated successfully!");
                            foundToUpdate = true;
                            break;
                        }
                    }

                    if (!foundToUpdate) {
                        System.out.println("Phone not found.");
                    }
                    break;

                case "5":
                    System.out.print("Enter the name of the phone to delete: ");
                    String nameToDelete = scanner.nextLine();

                    Iterator<Phone> iterator = phoneList.iterator();
                    while (iterator.hasNext()) {
                        Phone phoneObj = iterator.next();
                        if (phoneObj.getPhoneName().equalsIgnoreCase(nameToDelete)) {
                            iterator.remove();
                        }
                    }
                    break;

                case "6":
                    System.out.println("Thank you!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
