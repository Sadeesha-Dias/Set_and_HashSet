import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Greetings Programmer!");

        Set<String> userNames = new HashSet<>();

        userNames.add("Kally");
        userNames.add("Jerry");
        userNames.add("Gab");
        userNames.add("Alfred");
        userNames.add("Makioa");

        System.out.println("########### method 1 ##########");
        System.out.println(userNames);

        //using enhanced for loop
        System.out.println("########### method 2 ##########");
        for(String sysName : userNames){
            System.out.println(sysName);
        }

        System.out.println("########### method 3 ##########");
        userNames.forEach(System.out::println); //using lambda to iterate

        System.out.println("########### method 4 ##########");
        //using Iterator to iterate
        Iterator<String> userNamesIterate = userNames.iterator();
        while(userNamesIterate.hasNext()){
            System.out.println(userNamesIterate.next());
        }

        System.out.println("###### name check #####");
        //name check
        System.out.println(userNames.contains("Jerry"));
    }
}