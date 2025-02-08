public class Quote {
    public static String bigBrotherQuote() {
        int rand = (int) (Math.random() * 3);
        switch (rand) {
            case 0 : return "Freedom is peace.";
            case 1 : return "Slavery is freedom.";
            case 2 : return "Ignorance is strength.";
            default : return "Big Brother is watching you.";
        }
    }
}
