package OnlineProblemsAndLeetcode;

public class ParcelSorter {

    public static String parcelSorter(int length, int height, int width, int mass){
        String type="both";
        if((length*height*width >1000000 | ((length >70)|(width>70)|(height> 70)) & mass>=20)){
            type="both";
        }else if(length*height*width >1000000 ||((length >70)||(width>70)||(height> 70))){
             type="large";
        }else if(mass>=20){
            type="heavy";
        }else{
            type="notheavy";
        }

        if(type.equals("both")){
            return "abnormal";
        }else if(type.equals("large")){
            return "special";
        }else if(type.equals("heavy")){
            return "special";
        }
        else{
            return "notspecial";
        }

    }

    public static void main(String[] args) {
        System.out.println(parcelSorter(7,7,7,25));
    }
}
