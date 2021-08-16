package homework8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HM8 {
    public static void main(String[] args) {
        someMethod();
    }
    private static void someMethod(){
        PhoneBook phoneBook=new PhoneBook();

        phoneBook.add("surname1", "1239123321");
        phoneBook.add("surname1", "5432155326");
        phoneBook.add("surname2", "7444155326");
        phoneBook.add("surname2", "4564555672");
        phoneBook.add("surname1", "7645599999");
        phoneBook.add("surname3", "75431181511");
        phoneBook.add("surname4", "0852323199");
        phoneBook.add("surname2", "62481231133");
        phoneBook.add("surname3", "74333325234");

        System.out.println(phoneBook.get("surname1"));
        System.out.println(phoneBook.get("surname2"));
        System.out.println(phoneBook.get("surname3"));
        System.out.println(phoneBook.get("surname4"));

    }
}
class PhoneBook {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
    }

