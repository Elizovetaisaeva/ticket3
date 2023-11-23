public class Main {
    public static void main(String[] args) {
       String str = new String("");
       int exactlyHalf = str.length() /2;
       String firsPart = str.substring(0, exactlyHalf);
       String secondPart = str.substring(exactlyHalf);
        System.out.println(" Первая часть " + firsPart);
        System.out.println(" Вторая часть " + secondPart);

    }

}
