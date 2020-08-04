//
// This is only a SKELETON file for the 'Pig Latin' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class translator {
 
  static word_translate(word) {
	var vowelsMid = ["a","e","i","o","u","y"];
	var vowelsBeg = ["a","e","i","o","u","xr","yt"];
	var result = word;
	if(vowelsBeg.includes(word[0]) || vowelsBeg.includes(word.slice(0,2))){
		result = word + "ay";
	} else {
		var firstVow = 0;
		while(firstVow < word.length && !vowelsMid.includes(word[firstVow]))
			firstVow++;
		if(firstVow < word.length && word[firstVow] == 'u' && word[firstVow - 1] == 'q')
			firstVow++;
		if(firstVow == 0) firstVow++;
		result = word.slice(firstVow) + word.slice(0,firstVow) + "ay";
	}
	return result;
  
   //throw new Error("Remove this statement and implement this function");
  }

  static translate(sentence){
  	var words = sentence.split(" ");
	for(var i = 0; i < words.length; ++i)
		words[i] = this.word_translate(words[i]);
	var res = "";
	for(var i = 0; i < words.length; ++i) res += words[i] + " ";
	return res.slice(0,res.length - 1);
  }
}
