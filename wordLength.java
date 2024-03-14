//Given a string s consisting of words and spaces, return the length of the last word in the string.
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" "); //split the words by " "
        return str[str.length-1].length(); //take the last word of the string by str.length-1 of the array, then calculate the length of the last word

    }
}
