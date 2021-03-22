import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ");
        System.out.println("Chọn chức năng theo số");
        System.out.println("1.Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerPhone managerPhone = new ManagerPhone();
        int choose;
        do {
            showMenu();
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    managerPhone.displayPhone();
                    break;
                case 2:
                    managerPhone.addList();
                    break;
                case 3:
                    managerPhone.editPhonenumber();
                    break;
                case 4:
                    managerPhone.delete();
                    break;
                case 5:
                    managerPhone.findName();
                    break;
                case 6:
                    managerPhone.readFile();
                    break;
                case 7:
                    managerPhone.writeFile();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Nhập lại");
            }
        }
        while (choose != 8);

    }
}
