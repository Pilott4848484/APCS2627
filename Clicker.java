public class Clicker {
    private int clicks;
    public Clicker(){
        clicks=0;
    }
    public Clicker(int startVal){
        clicks=startVal;
    }
    public void click() {
        clicks++;
    }
    public void reset() {
        clicks = 0;
    }
    public int getClicks() {
        return clicks;
    }
    public String toString(){
        String str = "";
        str+="clicks: ";
        str+=clicks;
        return str;
    }
}

//if no constructor is made, java will will create a default no-argument contructor (all feilds set to empty/null/0)