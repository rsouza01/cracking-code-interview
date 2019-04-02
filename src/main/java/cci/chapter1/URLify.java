package cci.chapter1;

public class URLify {


    public static void main(String[] args) {

        URLify urlify = new URLify();
        urlify.run();
    }

    private void run() {

        String url = "S1 S2 S3    ";

        int size = url.length() - 1;

        while(' ' == url.charAt(size)) size--;

        System.out.println("cci.chapter1.URLify :'" + String.valueOf(urlify(url.toCharArray(), size+1)) + "'.");
    }

    private static char[] urlify(char[] url, int size) {

        System.out.println("urlify '" + String.valueOf(url) + "', " + size + ".");

        int pos = size - 1;

        int writePtr = url.length - 1;

        while (writePtr >= 0) {

            if(url[pos] != ' ') {

                url[writePtr] = url[pos];

                writePtr--;

            } else {
                writePtr -= 2;
                url[writePtr] = '%';
                url[writePtr+1] = '2';
                url[writePtr+2] = '0';
                writePtr--;
            }

            pos--;
        }

        return url;
    }
}