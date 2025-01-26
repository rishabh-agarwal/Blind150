import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        Map<String, Integer> map1 = new HashMap<>();

        for(char c: s.toCharArray()){
            map1.put(String.valueOf(c).toUpperCase(), map1.getOrDefault(c, 0) + 1);
        }

        Map<String, Integer> map2 = new HashMap<>();

        for(char c: t.toCharArray()){
            map2.put(String.valueOf(c).toUpperCase(), map2.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry: map1.entrySet()){
            if(map2.get(entry.getKey())!=entry.getValue())
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
        System.out.println(new ValidAnagram().isAnagram("Rishabh", "rishabh"));
        System.out.println(new ValidAnagram().isAnagram("jar", "jam"));
    }
}
