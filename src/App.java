import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Создать словарь HashMap. Обобщение <Integer, String>.
// Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
// Изменить значения сделав пол большой буквой.
// Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
// *Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "197375 Иванов Иван Иванович 28 м");
        hashMap.put(2, "197342 Петрова Фаина Осиповна 40 ж");
        hashMap.put(3, "100200 Петросян Артур Филиппович 89 м");
        hashMap.put(4, "197375 Иванова Мария Ильинична 29 ж");

        for (Map.Entry<Integer, String> iterable_element : hashMap.entrySet()) {
            System.out.println("ключ: "+iterable_element.getKey()+" "+"значение: "+iterable_element.getValue());
        }

        ArrayList<Integer>adressIndex = new ArrayList<>();
        ArrayList<String>family = new ArrayList<>();
        ArrayList<String>name = new ArrayList<>();
        ArrayList<String>soname = new ArrayList<>();
        ArrayList<Integer>age = new ArrayList<>();
        ArrayList<String>male = new ArrayList<>();
        LinkedList<Integer>index = new LinkedList<>();

        Set<Integer> keySet = hashMap.keySet();
        for (int i=0; i<keySet.size(); i++) {
            String [] string = (hashMap.get(keySet.toArray()[i]).split("\n"));
            for (int j=0; j<string.length; j++) {
                String [] tmp = string[j].split(" ");
                System.out.println(tmp[0] + " " + tmp[1] + " " + tmp[2] + " " + tmp[3] + " " + tmp[4] + " " + tmp[5].toUpperCase());
                // System.out.println(tmp[1] + " " + tmp[2].charAt(0) + "." + " " + tmp[3].charAt(0) + ".");
            }
        }

        for (int i=0; i<keySet.size(); i++) {
            String [] string = (hashMap.get(keySet.toArray()[i]).split("\n"));
            for (int j=0; j<string.length; j++) {
                String [] tmp = string[j].split(" ");
                index.add(i);
                family.add(tmp[1] + " ");
                name.add(tmp[2].charAt(0) + ".");
                soname.add(tmp[3].charAt(0) + ".");
                age.add(Integer.valueOf(tmp[4]));
                System.out.printf(family.get(index.get(i)));
                System.out.printf(name.get(index.get(i)));
                System.out.printf(soname.get(index.get(i)) + " ");
                System.out.printf(age.get(index.get(i)).toString() + " ");
                System.out.println();
            }
        }
        ArrayList<Integer> tmp = new ArrayList<>(age);
        Collections.sort(tmp);
            for (int i=0; i < tmp.size(); i++) {
                int digits = age.indexOf(tmp.get(i));
                index.set(i, digits);
            }
            for (int i=0; i<index.size(); i++) {
                System.out.println();
                System.out.printf(age.get(index.get(i)).toString() + " ");
                System.out.printf(family.get(index.get(i)));
                System.out.printf(name.get(index.get(i)));
                System.out.printf(soname.get(index.get(i)) + " ");
                System.out.println();
            }

        


    }
}
            
    

            




        // Map<String, List<String>> hm = new HashMap<String, List<String>>();
        // List<String> value1 = new ArrayList<String>();
        // value1.add("197375");
        // value1.add("Иванов");
        // value1.add("Иван");
        // value1.add("Иванович");
        // value1.add("28");
        // value1.add("м");
        // List<String> value2 = new ArrayList<String>();
        // value2.add("197342");
        // value2.add("Петрова");
        // value2.add("Фаина");
        // value2.add("Осиповна");
        // value2.add("40");
        // value2.add("ж");
        // List<String> value3 = new ArrayList<String>();
        // value3.add("100200");
        // value3.add("Петросян");
        // value3.add("Артур");
        // value3.add("Филиппович");
        // value3.add("89");
        // value3.add("м");

        // hm.put("key1", value1);
        // hm.put("key2", value2);
        // hm.put("key3", value3);
        
        // System.out.println(hm.get("key1"));
        // System.out.println(hm.get("key2"));
        // System.out.println(hm.get("key3"));

        // value1.add("М");
        // value2.add("Ж");
        // value3.add("М");

        // System.out.println(hm.get("key1"));
        // System.out.println(hm.get("key2"));
        // System.out.println(hm.get("key3"));


        // System.out.println(value1.subList(1, 4));


        // for (int i=0; i<value1.size(); i++) {
        //     String[] a = value1[i].split(" ");    
        // }
        
        // System.out.println(value1[1].chatAt(0));


        


        


    

