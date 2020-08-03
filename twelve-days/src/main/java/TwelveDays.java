class TwelveDays {
    String[] sents = {
   	"Partridge in a Pear Tree",
	"Turtle Doves",
        "French Hens",
	"Calling Birds",
	"Gold Rings",
	"Geese-a-Laying",
	"Swans-a-Swimming",
	"Maids-a-Milking",
	"Ladies Dancing",
	"Lords-a-Leaping",
	"Pipers Piping",
	"Drummers Drumming"
    };
    String[] days = {
	"first", "second", "third", "fourth", "fifth", "sixth", "seventh",
	"eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    String[] count = {
	"a", "two", "three", "four", "five", "six", "seven", "eight",
	"nine", "ten", "eleven", "twelve"
    };
    String verse(int verseNumber) {
      	String ret = "On the " + days[verseNumber - 1] + " day of Christmas my true love gave to me: ";
	ret += count[verseNumber - 1] + " " + sents[verseNumber - 1];
	for(int i = verseNumber - 1; i >= 2; --i){
		ret += ", " + count[i - 1] + " " + sents[i - 1];
	}
	if(verseNumber != 1)
		ret += ", and " + count[0] + " " + sents[0];
	ret += ".\n";
	return ret;
	//throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String verses(int startVerse, int endVerse) {
	String res = "";
	for(int i = startVerse; i <= endVerse; ++i){
		res = res + verse(i);
		if(i != endVerse) res += "\n";
	}
	return res;
	//throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
    
    String sing() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    	return verses(1,12);
    }
}
