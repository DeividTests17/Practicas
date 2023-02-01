import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CifradoCesar {
    public static void main(String[] args) {

        System.out.println("Ingrese su mensaje :  ");

        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        char fraseChar[] = frase.toLowerCase().toCharArray();

        List<Character> list = new ArrayList<>();
        for (char val : fraseChar) {
            switch (val) {
                case ' ':
                    list.add(' ');
                    break;
                case 'a':
                    list.add('d');
                    break;
                case 'b':
                    list.add('e');
                    break;
                case 'c':
                    list.add('f');
                    break;
                case 'd':
                    list.add('g');
                    break;
                case 'e':
                    list.add('h');
                    break;
                case 'f':
                    list.add('i');
                    break;
                case 'g':
                    list.add('j');
                    break;
                case 'h':
                    list.add('k');
                    break;
                case 'i':
                    list.add('l');
                    break;
                case 'j':
                    list.add('m');
                    break;
                case 'k':
                    list.add('n');
                    break;
                case 'l':
                    list.add('o');
                    break;
                case 'm':
                    list.add('p');
                    break;
                case 'n':
                    list.add('q');
                    break;
                case 'o':
                    list.add('r');
                    break;
                case 'p':
                    list.add('s');
                    break;
                case 'q':
                    list.add('t');
                    break;
                case 'r':
                    list.add('u');
                    break;
                case 's':
                    list.add('v');
                    break;
                case 't':
                    list.add('w');
                    break;
                case 'u':
                    list.add('x');
                    break;
                case 'v':
                    list.add('y');
                    break;
                case 'w':
                    list.add('z');
                    break;
                case 'x':
                    list.add('a');
                    break;
                case 'y':
                    list.add('b');
                    break;
                case 'z':
                    list.add('c');
                    break;
                case '0':
                    list.add('3');
                    break;
                case '1':
                    list.add('4');
                    break;
                case '2':
                    list.add('5');
                    break;
                case '3':
                    list.add('6');
                    break;
                case '4':
                    list.add('7');
                    break;
                case '5':
                    list.add('8');
                    break;
                case '6':
                    list.add('9');
                    break;
                case '7':
                    list.add('0');
                    break;
                case '8':
                    list.add('1');
                    break;
                case '9':
                    list.add('2');
                    break;
            }
        }
        System.out.println("El mensaje es : " + frase);
        System.out.print("El cifrado fue :    ");
        for (char valor : list) {
            System.out.print(valor);
        }

    }
}