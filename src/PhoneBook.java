public class PhoneBook {
    private String number;
    private String groupOfContacts;
    private String name;
    private String sex;
    private String address;
    private String age;
    private String email;

    public PhoneBook() {
    }

    public PhoneBook(String number, String groupOfContacts, String name, String sex, String address,
                     String age, String email) {
        this.number = number;
        this.groupOfContacts = groupOfContacts;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.age = age;
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGroupOfContacts() {
        return groupOfContacts;
    }

    public void setGroupOfContacts(String groupOfContacts) {
        this.groupOfContacts = groupOfContacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString1() {
        return number + "," +
                "," + groupOfContacts + '\'' +
                ","+ name +
                "," + sex +
                "," + address +
                "," + age +
                "," + email;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "number='" + number + '\'' +
                ", groupOfContacts='" + groupOfContacts + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
