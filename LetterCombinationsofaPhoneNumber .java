public class LetterCombinationsofaPhoneNumber {

    class Solution {
    public List<String> letterCombinations(String digits) {

        if(digits.isEmpty()){
            return  new ArrayList();
        }

    HashMap<Character , String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

    List <String> result = new ArrayList();
    lettersRecurse(digits, "", map, result);
    return result;

    }
    void lettersRecurse(String nextDigits, String current, Map<Character, String> map, List<String> result){

        if (nextDigits.isEmpty()){
            result.add(current);
            return;
        }

        char digit = nextDigits.charAt(0);
        String letters = map.get(digit);

        for(char letter : letters.toCharArray()){
            lettersRecurse(nextDigits.substring(1), current+letter, map, result);
        }
    }
}
    
}
