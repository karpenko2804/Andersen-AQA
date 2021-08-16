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
    private Map<String, List<String>> person = new HashMap<>();
    private List<String> number;

    public void add(String surname, String phone_number) {
        if (person.containsKey(surname)) {
            number = person.get(surname);

            number.add(phone_number);
            person.put(surname, number);
        } else {
            number = new ArrayList<>();
            number.add(phone_number);
            person.put(surname, number);
        }
    }

    public List<String> get(String surname) {
        return person.get(surname);
    }
    }

