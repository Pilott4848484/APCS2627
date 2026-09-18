public class ClickerMain {
    public static void main(String[] args){
        Clicker clicker1 = new Clicker();
        Clicker clicker2 = new Clicker(15);
        clicker1.click();
        clicker1.click();
        clicker1.click();
        clicker1.click();

        System.out.println(clicker1.getClicks());
        System.out.println(clicker2.getClicks());

        clicker2.click();
        clicker2.click();
        clicker2.click();
        clicker2.click();
        clicker2.click();
        clicker2.click();
        clicker2.click();
        clicker2.click();
        clicker2.click();
        clicker2.click();
        clicker2.click();
        clicker2.click();
        clicker2.click();

        System.out.println(clicker1.getClicks());
        System.out.println(clicker2.getClicks());

        clicker2.reset();

        System.out.println(clicker1.getClicks());
        System.out.println(clicker2.getClicks());

        System.out.println(clicker1.toString());
        System.out.println(clicker2);

    }
}
