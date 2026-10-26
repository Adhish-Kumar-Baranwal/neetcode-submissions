class Solution {

    public String encode(List<String> strs) {

        String encoded_string = "";

        for(String str : strs){
            encoded_string += str.length() + "#" +str;
        }

        return encoded_string;

    }

    public List<String> decode(String str) {

        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            decoded_strs.add(str.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }

        return decoded_strs;

    }
}
