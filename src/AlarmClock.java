/**
 * Created by young on 6/27/17.
 */
public class AlarmClock {

    private String determineHour(int firstTwo) {
        int hour = firstTwo;
        if (hour > 12) {
            hour -= 12;
        }
        String[] hourToWord = new String[13];
        hourToWord[0] = "twelve";
        hourToWord[1] = "one";
        hourToWord[2] = "two";
        hourToWord[3] = "three";
        hourToWord[4] = "four";
        hourToWord[5] = "five";
        hourToWord[6] = "six";
        hourToWord[7] = "seven";
        hourToWord[8] = "eight";
        hourToWord[9] = "nine";
        hourToWord[10] = "ten";
        hourToWord[11] = "eleven";
        hourToWord[12] = "twelve";
        return hourToWord[hour];
    }

    private String determineMinutes(int lastTwo) {
        String[] minsToWord = new String[60];
        minsToWord[0] = "";
        minsToWord[1] = "oh one";
        minsToWord[2] = "oh two";
        minsToWord[3] = "oh three";
        minsToWord[4] = "oh four";
        minsToWord[5] = "oh five";
        minsToWord[6] = "oh six";
        minsToWord[7] = "oh seven";
        minsToWord[8] = "oh eight";
        minsToWord[9] = "oh nine";
        minsToWord[10] = "ten";
        minsToWord[11] = "eleven";
        minsToWord[12] = "twelve";
        minsToWord[13] = "thirteen";
        minsToWord[14] = "fourteen";
        minsToWord[15] = "fifteen";
        minsToWord[16] = "sixteen";
        minsToWord[17] = "seventeen";
        minsToWord[18] = "eighteen";
        minsToWord[19] = "nineteen";
        minsToWord[20] = "twenty";
        minsToWord[21] = "twenty-one";
        minsToWord[22] = "twenty-two";
        minsToWord[23] = "twenty-three";
        minsToWord[24] = "twenty-four";
        minsToWord[25] = "twenty-five";
        minsToWord[26] = "twenty-six";
        minsToWord[27] = "twenty-seven";
        minsToWord[28] = "twenty-eight";
        minsToWord[29] = "twenty-nine";
        minsToWord[30] = "thirty";
        minsToWord[31] = "thirty-one";
        minsToWord[32] = "thirty-two";
        minsToWord[33] = "thirty-three";
        minsToWord[34] = "thirty-four";
        minsToWord[35] = "thirty-five";
        minsToWord[36] = "thirty-six";
        minsToWord[37] = "thirty-seven";
        minsToWord[38] = "thirty-eight";
        minsToWord[39] = "thirty-nine";
        minsToWord[40] = "forty";
        minsToWord[41] = "forty-one";
        minsToWord[42] = "forty-two";
        minsToWord[43] = "forty-three";
        minsToWord[44] = "forty-four";
        minsToWord[45] = "forty-five";
        minsToWord[46] = "forty-six";
        minsToWord[47] = "forty-seven";
        minsToWord[48] = "forty-eight";
        minsToWord[49] = "forty-nine";
        minsToWord[50] = "fifty";
        minsToWord[51] = "fifty-one";
        minsToWord[52] = "fifty-two";
        minsToWord[53] = "fifty-three";
        minsToWord[54] = "fifty-four";
        minsToWord[55] = "fifty-five";
        minsToWord[56] = "fifty-six";
        minsToWord[57] = "fifty-seven";
        minsToWord[58] = "fifty-eight";
        minsToWord[59] = "fifty-nine";
        return minsToWord[lastTwo];
    }

}
