import java.util.Scanner;

public class IOPhoneBook {
    static Scanner scanner = new Scanner(System.in);

    public static String phonenumber() {
        System.out.println("Nhập Số điện thoại");
        while (true) {
            try {
                String number = scanner.nextLine();
                if (!number.trim().equals("")) {
                    return number;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lai nhóm");
            }
        }

    }

    public static String groupOfContacts() {
        System.out.println("Nhập nhóm");
        while (true) {
            try {
                String groupOfContacts = scanner.nextLine();
                if (!groupOfContacts.trim().equals("")) {
                    return groupOfContacts;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lai nhóm");
            }
        }
    }

    public static String name() {
        System.out.println("Nhập Họ tên");
        while (true){
            try {
                String name = scanner.nextLine();
                if (!name.trim().equals("")) {
                    return name;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lai nhóm");
            }
        }
    }

    public static String sex() {
        System.out.println("Nhập giới tính");
        while (true) {
            try {
                String sex = scanner.nextLine();
                if (!sex.trim().equals("")) {
                    return sex;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lai giới tính");
            }
        }
    }

    public static String address() {
        System.out.println("Nhập địa chỉ");
        while (true) {
            try {
                String address = scanner.nextLine();
                if (!address.trim().equals("")) {
                    return address;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lai nhóm");
            }
        }
    }

    public static String age() {
        System.out.println("Nhập tuổi");
        while (true) {
            try {
                String age = scanner.nextLine();
                if (!age.trim().equals("")) {
                    return age;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lai nhóm");
            }
        }
    }

    public static String mail() {
        System.out.println("Nhập mail");
        while (true) {
            try {
                String mail = scanner.nextLine();
                if (!mail.trim().equals("")) {
                    return mail;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Nhập lại mail");
            }
        }
    }
}
