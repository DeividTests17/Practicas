import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CifradoCesar {
    public static void main(String[] args) {
        System.out.println("ingresa la frase: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        char fraseToChar[] = frase.toLowerCase().toCharArray();
        List<Character> listChar = new ArrayList<>();
        for(char val: fraseToChar){
            switch(val){
                case ' ':
                    listChar.add(' ');
                    break;
                case 'a': 
                    listChar.add('d');
                    break;
                case 'b': 
                    listChar.add('e');
                    break;
                case 'c': 
                    listChar.add('f');
                    break;
                case 'd': 
                    listChar.add('g');
                    break;
                case 'e': 
                    listChar.add('h');
                    break;
                case 'f': 
                    listChar.add('i');
                    break;
                case 'g': 
                    listChar.add('j');
                    break;
                case 'h': 
                    listChar.add('k');
                    break;
                case 'i': 
                    listChar.add('l');
                    break;
                case 'j':
                    listChar.add('m');
                    break;
                case 'k':
                    listChar.add('n');
                    break;
                case 'l':
                    listChar.add('o');
                    break;
                case 'm':
                    listChar.add('p');
                    break;
                case 'n':
                    listChar.add('q');
                    break;
                case 'o':
                    listChar.add('r');
                    break;
                case 'p':
                    listChar.add('s');
                    break;
                case 'q':
                    listChar.add('t');
                    break;
                case 'r':
                    listChar.add('u');
                    break;
                case 's':
                    listChar.add('v');
                    break;
                case 't':
                    listChar.add('w');
                    break;
                case 'u':
                    listChar.add('x');
                    break;
                case 'v':
                    listChar.add('y');
                    break;
                case 'w':
                    listChar.add('z');
                    break;
                case 'x':
                    listChar.add('a');
                    break;
                case 'y':
                    listChar.add('b');
                    break;
                case 'z':
                    listChar.add('c');
                    break;
                case '0':
                    listChar.add('3');
                    break;
                case '1':
                    listChar.add('4');
                    break;
                case '2':
                    listChar.add('5');
                    break;
                case '3':
                    listChar.add('6');
                    break;
                case '4':
                    listChar.add('7');
                    break;
                case '5':
                    listChar.add('8');
                    break;
                case '6':
                    listChar.add('9');
                    break;
                case '7':
                    listChar.add('0');
                    break;
                case '8':
                    listChar.add('1');
                    break;
                case '9':
                    listChar.add('2');
                    break;
            }
        }
        System.out.println("Tu mensaje: "+frase);
        System.out.print("Cifrado:    ");
        for(char val:listChar){
            System.out.print(val);
        }


    }
}