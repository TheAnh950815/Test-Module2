import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerPhone {
    static ArrayList<PhoneBook> listPhone = new ArrayList<>();
    PhoneBook phoneBook = new PhoneBook();

    public void displayPhone() {
        for (int i = 0; i < listPhone.size(); i++) {
            System.out.println(listPhone.get(i));
            if (i % 5 == 4 && i != listPhone.size() - 1) {
                System.out.println("còn tiếp");
            }
        }
    }

    public void addList() {
        listPhone.add(new PhoneBook(IOPhoneBook.phonenumber(), IOPhoneBook.groupOfContacts(), IOPhoneBook.name(), IOPhoneBook.age(),
                IOPhoneBook.sex(), IOPhoneBook.address(), IOPhoneBook.mail()));
    }

    public void editPhonenumber() {
        int index = findPhonenumber();
        for (int i = 0; i < listPhone.size(); i++) {
            if (index == -1) {
                System.out.println("Số điện thoại không tồn tại");
            } else {
                listPhone.get(i).setNumber(IOPhoneBook.phonenumber());
                listPhone.get(i).setGroupOfContacts(IOPhoneBook.groupOfContacts());
                listPhone.get(i).setName(IOPhoneBook.name());
                listPhone.get(i).setSex(IOPhoneBook.sex());
                listPhone.get(i).setAddress(IOPhoneBook.address());
                listPhone.get(i).setEmail(IOPhoneBook.mail());
            }
        }

    }

    public int findPhonenumber() {
        for (int i = 0; i < listPhone.size(); i++) {
            if (listPhone.get(i).getNumber().equals(IOPhoneBook.phonenumber())) {
                return i;
            }
        }
        return -1;
    }

    public void delete() {
        int index = findPhonenumber();
        for (int i = 0; i < listPhone.size(); i++) {
            if (index == -1) {
                System.out.println("Số điện thoại không tồn tại");
            } else {
                listPhone.remove(index);
            }
        }
    }

    public void findName() {

        for (int i = 0; i < listPhone.size(); i++) {
            if (listPhone.get(i).equals(IOPhoneBook.name())) {
                System.out.println(listPhone.get(i));
            } else {
                System.out.println("Số người không tồn tại");
            }
        }
    }

    public void writeFile() {
        try {
            File file = new File("write.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < listPhone.size(); i++) {
                bufferedWriter.write(listPhone.get(i).toString1() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("write.txt"));
            String line = bufferedReader.readLine();
            while (!line.equals("")) {
                String[] element = line.split(",");
                listPhone.add(new PhoneBook(element[0], element[1], element[2],
                        element[3], element[4], element[5], element[6]));
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
