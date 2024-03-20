package pl.gornik;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("polski",5);
        maps.put("matematyka",3);
        maps.put("historia",2);
        maps.put("fizyka",4);
        maps.put("matematyka",4);

//        System.out.println(maps.toString());
        for (Map.Entry<String,Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() +": " + entry.getValue());
        }

        System.out.println("-------------------------");

        Map<String,Double> products = new HashMap<>();
        products.put("Mleko",3.12);
        products.put("Czekolada",6.12);
        products.put("Chleb",7.69);
        products.put("Herbata",9.99);
        products.put("Kawa",12.12);

        System.out.println(products.toString());

        System.out.println(products.containsKey("Czekolada"));
        maps.remove("polski");

        System.out.println(maps.toString());

        System.out.println("-------------------------");

//        Iterator<String> iterator = products.keySet().iterator();
//        while (iterator.hasNext()) {
//            String itr = iterator.next();
//            System.out.println(itr + ": " + itr.get);
//        }


//        Iterator<Double> iterator1 = products.values().iterator();
//        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
//        }

        Map<String,String> mapProduct1 = new TreeMap<>();
        mapProduct1.put("Olej","Tłuszcze");
        mapProduct1.put("Masło","Tłuszcze");
        mapProduct1.put("Mleko","Nabiał");
        mapProduct1.put("Ser","Nabiał");
        mapProduct1.put("Parowki","Mięso");
        mapProduct1.put("Wołowina","Mięso");
        mapProduct1.put("Kurczak","Mięso");
        for (Map.Entry<String,String> entry : mapProduct1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

        Map<User,String> users = new TreeMap<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getPesel().compareTo(o2.getPesel());
            }
        });
        User user1 = new User("Marian",34,"95042535621");
        User user2 = new User("Bogdan",54,"54341253562");
        User user3 = new User("Stefan",76,"54545356211");
        User user4 = new User("Marcinek",17,"32323235621");

        users.put(user1,"Budowalniec");
        users.put(user2,"Złomiarz");
        users.put(user3,"Rybak");
        users.put(user4,"Złodziej");

        for (Map.Entry<User,String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        }
    }

