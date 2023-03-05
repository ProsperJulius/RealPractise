package CrackingTheCodingInterviewSerious;

public class StringCompression {
    public static String stringCompression(String textToCompress){
        if(textToCompress==null) return null;
        StringBuilder compressed= new StringBuilder();
        int counter=0;
        for(int i=0;i<textToCompress.length();i++){
            counter++;
            if(i+1>=textToCompress.length()|| textToCompress.charAt(i)!= textToCompress.charAt(i+1)){
                compressed.append(textToCompress.charAt(i));
                compressed.append(counter);
                counter=0;
            }

        }

        return compressed.toString().length()>textToCompress.length()?textToCompress:compressed.toString();
    }


    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
    }
}
