package cci.chapter1;

public class StringCompression {


    public static void main(String[] args) {

        StringCompression sc = new StringCompression();
        sc.run();
    }

    private void run() {

        String string2compress = "aabcccccaaa";
        String compressedByFunction = StringCompression.compress(string2compress);
        System.out.println("cci.chapter1.StringCompression  :'" + compressedByFunction + "'.");

        string2compress = "abcd";
        compressedByFunction = StringCompression.compress(string2compress);
        System.out.println("cci.chapter1.StringCompression  :'" + compressedByFunction + "'.");

        string2compress = "aaaaaaaaabcd";
        compressedByFunction = StringCompression.compress(string2compress);
        System.out.println("cci.chapter1.StringCompression  :'" + compressedByFunction + "'.");

    }

    private static String compress(String string) {

        StringBuilder compressed = new StringBuilder();

        char oldChar = string.charAt(0);
        int count = 1;

        for(int n = 1; n < string.length(); n++) {

            char chr = string.charAt(n);

            if(chr == oldChar) {
                count++;
            } else {
                compressed.append(oldChar);
                compressed.append(count);
                oldChar = chr;
                count = 1;
            }
        }

        compressed.append(oldChar);
        compressed.append(count);

        return compressed.length() < string.length() ? compressed.toString() : string;
    }
}