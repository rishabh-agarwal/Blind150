import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = new String[]{"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] sortArr = str.toCharArray();
            Arrays.sort(sortArr);
            if(map.containsKey(Arrays.toString(sortArr))) {
                List<String> list = map.get(Arrays.toString(sortArr));
                list.add(str);
                map.put(Arrays.toString(sortArr), list);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(Arrays.toString(sortArr), list);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry entry: map.entrySet()){
            result.add((List<String>) entry.getValue());
        }
        return result;
    }
}
