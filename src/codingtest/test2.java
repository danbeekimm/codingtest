package codingtest;


import java.util.StringTokenizer;

public class test2 {

    public static void main(String[] args) {

        String keyword = "¼ÕÈï¹Î,Ä²Å×,,¸¶¿îÆ°,±è´ö¹è,";
        splitTest(keyword); 
        System.out.println();
        System.out.println();
        stringTokenizerTest(keyword);
    }

    //¸Þ¼Òµå
    public static void stringTokenizerTest(String str){

        System.out.println("stringTokenizerTest() Start");
        StringTokenizer tokenizer = new StringTokenizer(str,",");

        for(int i = 0; tokenizer.hasMoreTokens(); i++){
            System.out.println(i + "¹ø¤Š : " + tokenizer.nextToken());
        }

        System.out.println("stringTokenizerTest() End");

    }

   
    public static void splitTest(String str){

        System.out.println("splitTest() Start");
        String split[] = str.split(",");

        int index = 0;
        for(String data : split){
            System.out.println(index + "¹ø¤Š : " + data);
            index++;
        }

        System.out.println("splitTest() End");

    }


}
