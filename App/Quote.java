public class Quote {
    public static String bigBrotherQuote() {
        return switch ((int) (Math.random() * 20)) {
            case 0 -> "Freedom is peace.";
            case 1 -> "Slavery is freedom.";
            case 2 -> "Ignorance is strength.";
            case 3 -> "Freedom is the ability to say two plus two equals four.";
            case 4 -> "In the face of danger, truth is the first casualty.";
            case 5 -> "Power is not a means; it is an end.";
            case 6 -> "You’re only a rebel from the waist downwards.";
            case 7 -> "The consequences of every act are included in the act itself.";
            case 8 -> "If you want to keep a secret, you must also hide it from yourself.";
            case 9 -> "Who controls the past controls the future. Who controls the present controls the past.";
            case 10 -> "Perhaps one did not want to be loved so much as to be understood.";
            case 11 -> "The best books… are those that tell you what you know already.";
            case 12 -> "Perhaps a lunatic was simply a minority of one.";
            case 13 -> "If you kept the small rules you could break the big ones.";
            case 14 -> "Sanity is not statistical.";
            case 15 -> "Where there is equality, there can be sanity.";
            case 16 -> "To die hating them, that was freedom.";
            case 17 -> "But if thought corrupts language, language can also corrupt thought.";
            case 18 -> "We control matter because we control the mind.";
            case 19 -> "We shall meet in the place where there is no darkness.";
            default -> "Big Brother is watching you.";
        };
    }
}
