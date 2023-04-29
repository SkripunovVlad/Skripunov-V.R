package numOfSymbolsPerLine;

public class CountSymbols {
    public static int countSym(String text, char letter) {
        int counter = 0;
        for(int i = 0; i < text.length(); i++){

            if ((text.charAt(i) == letter) || (letter == Character.toUpperCase(letter))){
                counter++;
            }else{
                continue;
            }
        }
        return counter;
    }
}
