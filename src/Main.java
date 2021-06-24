public class Main {
    public static void main(String[] args) {
        PrepaidCard prepaidCard = new PrepaidCard(200);
        Line.A.enter(prepaidCard);
        Line.B.exit(prepaidCard);
        System.out.println(prepaidCard.isValid());
        System.out.println(prepaidCard.getValue());
        Line.C.enter(prepaidCard);
        Line.A.exit(prepaidCard);
        System.out.println(prepaidCard.isValid());
    }
}
