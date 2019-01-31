public class Crypto {
    public static String encrypt(String txt, int noOfCols){
        String noSpaceTxt = "";
        for(int i=0; i<txt.length(); i++){
            if(txt.charAt(i) != ' '){
                noSpaceTxt += txt.charAt(i);
            }
        }
        String text = noSpaceTxt.toUpperCase();
        int rem = text.length()%noOfCols;
        if (rem != 0){
            rem = noOfCols-rem;
        }
        for (int i=0; i<rem; i++){
            text += "X";
        }
        //System.out.println(text);

        int noOfRows = text.length()/noOfCols;
        String msg = "";
        int counter = 1;
        for(int i=0; i<noOfCols; i++){
            int index = i;
            for(int j=0; j<noOfRows; j++){
                msg += text.charAt(index);
                index += noOfCols;
            }
        }
        //System.out.println(msg);
        return msg;
    }

    public static String decrypt(String msg, int noOfCols){
        int noOfRows = msg.length()/noOfCols;
        return encrypt(msg,noOfRows);
    }
}
// thisisasecretmessage