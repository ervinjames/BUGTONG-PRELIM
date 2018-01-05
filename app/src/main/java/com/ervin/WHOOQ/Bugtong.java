package com.ervin.WHOOQ;

public class Bugtong {
    public String bugtong[];
    public String choices[][];
    public String answer[];

    public final int MAX_SIZE = 10;          //Array maximum size
    public final int TOTAL_SIZE = 10;        //Total questions set for the user
    public static int questionShown = 0;    //Counter for total questions being shown to the user
    public static int SCORE = 50;           /*Scoring Rule:
                                                if correct score => sum of current score and timeremaining multiplied by 10
                                                else score => difference of current score and 10
                                                note: timeremaining is in seconds.
                                             */
    public Bugtong() {
        bugtong = new String [MAX_SIZE];
        choices = new String [MAX_SIZE][10];
        answer = new String [MAX_SIZE];

        bugtong[0] = "The country which has no official language";
        choices[0][0] = "United States of America";
        choices[0][1] = "Canada";
        choices[0][2] = "Ireland";
        choices[0][3] = "South Africa";
        answer[0] = "A";

        bugtong[1] = "Which of the following is not a US State?";
        choices[1][0] = "Arizona";
        choices[1][1] = "Wyoming";
        choices[1][2] = "District of Columbia";
        choices[1][3] = "Colombo";
        answer[1] = "D";

        bugtong[2] = "Ceylon is the former name of this free sovereign country.";
        choices[2][0] = "Lebanon";
        choices[2][1] = "India";
        choices[2][2] = "Sri Lanka";
        choices[2][3] = "Finland";
        answer[2] = "C";

        bugtong[3] = "Which is not a European Country?";
        choices[3][0] = "Kosovo";
        choices[3][1] = "Swaziland";
        choices[3][2] = "Romania";
        choices[3][3] = "Croatia";
        answer[3] = "B";

        bugtong[4] = "All of the following are the Capital cities of the world except:";
        choices[4][0] = "Paris";
        choices[4][1] = "Oslo";
        choices[4][2] = "Bangkok";
        choices[4][3] = "Barcelona";
        answer[4] = "D";

        bugtong[5] = "Which of the following country in African region is considered Arabic?";
        choices[5][0] = "Ghana";
        choices[5][1] = "Egypt";
        choices[5][2] = "Sudan";
        choices[5][3] = "Kenya";
        answer[5] = "B";

        bugtong[6] = "Which of the following country uses the American Dollar as a currency?";
        choices[6][0] = "US Virgin Islands";
        choices[6][1] = "American Samoa";
        choices[6][2] = "Cook Islands";
        choices[6][3] = "Guam";
        answer[6] = "B";
    }

    public String getBugtong(int index){
        return bugtong[index];
    }

    public String getChoices(int index, int choice){
        return choices[index][choice];
    }

    public String getAnswer(int index){
        return answer[index];
    }

    public int getRandomIndex(){
        return 0 + new java.util.Random().nextInt(MAX_SIZE-1);
    }
}
