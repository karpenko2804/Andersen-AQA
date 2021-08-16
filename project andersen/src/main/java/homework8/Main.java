package homework8;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Черкассы", "Киев", "Одесса", "Сумы", "Николаев",
                "Харьков", "Винница", "Тернополь", "Черновцы", "Киев",
                "Киев", "Киев", "Одесса", "Сумы", "Сумы",
                "Николаев", "Николаев", "Николаев", "Николаев", "Николаев"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Все города");
        System.out.println(words.toString());
        System.out.println("Уникальные названия городов");
        System.out.println(unique.toString());
        System.out.println("кол-во повторений слов в списке ");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
    
}
