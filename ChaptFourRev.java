public class ChaptFourRev {
    private int myInt;
    private String myStr;

    // constructors
    public ChaptFourRev(String str, int num) {
        myStr = str;
        myInt = num;
    }

    public ChaptFourRev(String str) {
        myStr = str;
        myInt = 10;
    }

    // getters
    public int getMyInt(){return myInt;}
    public String getMyStr(){return myStr;}
    public char getLastLetter(){return myStr.charAt(myStr.length()-1);}
    public String getFirstHalf(){return myStr.substring(0, myStr.length()/2);}
    public String getSecondHalf(){return myStr.substring(myStr.length()/2);}

    // setter
    public void setMyInt(int num){myInt=num;}
}