public class ToggleString {
    public static void main(String args[]){

        String string = "EnCloPeDiA";

        String[] words = string.split(" ");
        String result = "";

        for(String word:words){
            String firstSub = word.substring(0, 1);
            String secondSub = word.substring(1);
            result = result+firstSub.toLowerCase()+secondSub.toUpperCase()+" ";
        }
        System.out.println("Reverse of String:" +result);
    }
}
